package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class op0 extends s4.s0 {
    public final int f35583a;
    public final up0 f35584b;

    public op0(up0 up0Var, int i10) {
        this.f35584b = up0Var;
        this.f35583a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        xh.n5 n5Var;
        zg.e eVar;
        up0 up0Var = this.f35584b;
        bq0 bq0Var = up0Var.f37324p0;
        if (i11 != 0) {
            bq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = bq0Var.f31346f0) != null) {
            eVar.f(i10, i11);
        }
        up0Var.h();
        if (up0Var.K != null) {
            if (up0Var.J != null && up0Var.c()) {
                up0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f35583a == 1) {
            n5Var = bq0Var.f31341c;
        } else {
            n5Var = bq0Var.f31339b;
        }
        if (n5Var != null && up0Var.c()) {
            n5Var.a();
        }
    }
}
