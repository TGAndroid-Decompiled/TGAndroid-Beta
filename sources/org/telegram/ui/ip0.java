package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ip0 extends s4.s0 {
    public final int f34228a;
    public final op0 f34229b;

    public ip0(op0 op0Var, int i10) {
        this.f34229b = op0Var;
        this.f34228a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.l5 l5Var;
        ah.h hVar;
        op0 op0Var = this.f34229b;
        up0 up0Var = op0Var.f35938p0;
        if (i11 != 0) {
            up0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = up0Var.f38152f0) != null) {
            hVar.f(i10, i11);
        }
        op0Var.h();
        if (op0Var.K != null) {
            if (op0Var.J != null && op0Var.c()) {
                op0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f34228a == 1) {
            l5Var = up0Var.f38147c;
        } else {
            l5Var = up0Var.f38145b;
        }
        if (l5Var != null && op0Var.c()) {
            l5Var.a();
        }
    }
}
