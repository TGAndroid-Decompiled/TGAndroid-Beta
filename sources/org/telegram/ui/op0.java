package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class op0 extends s4.t0 {
    public final int f40584a;
    public final up0 f40585b;

    public op0(up0 up0Var, int i10) {
        this.f40585b = up0Var;
        this.f40584a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.e5 e5Var;
        ah.h hVar;
        up0 up0Var = this.f40585b;
        aq0 aq0Var = up0Var.f42530p0;
        if (i11 != 0) {
            aq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = aq0Var.f35987f0) != null) {
            hVar.f(i10, i11);
        }
        up0Var.h();
        if (up0Var.K != null) {
            if (up0Var.J != null && up0Var.c()) {
                up0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f40584a == 1) {
            e5Var = aq0Var.f35981c;
        } else {
            e5Var = aq0Var.f35979b;
        }
        if (e5Var != null && up0Var.c()) {
            e5Var.a();
        }
    }
}
