package tw.edu.pu.csim.s1081692.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var txv: TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello tcyang"

        fun TestDEV(){
            var txv:TextView = findViewById<TextView>(R.id.txv)
            txv.text = "Dev分支"
        }

        fun TestDEV(){
            var txv:TextView = findViewById<TextView>(R.id.txv)
            txv.text = "Dev分支"
        }

    }
}