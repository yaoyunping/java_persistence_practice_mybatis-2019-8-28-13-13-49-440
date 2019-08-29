package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import tws.entity.Employee;

@Mapper
public interface EmployeeMapper {
	//@Select("select id,name,age from employee")
	public List<Employee>selectAll();

}
