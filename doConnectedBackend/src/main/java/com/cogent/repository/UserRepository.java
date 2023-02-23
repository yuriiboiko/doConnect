package com.cogent.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cogent.model.UserDao;
public interface UserRepository extends JpaRepository<UserDao, Integer> {

	UserDao findByUsername(String username);

	UserDao findById(int id);

	List<UserDao> findByEmail(String email);

	List<UserDao> findByName(String name);


	//@Query(value = "select * from user where role=\"user\";",nativeQuery = true)
	@Query(value = "select * from user where role=?1",nativeQuery = true)
	List<UserDao> findAllByRole(String role);

	//UserDao update(UserDao u);
}