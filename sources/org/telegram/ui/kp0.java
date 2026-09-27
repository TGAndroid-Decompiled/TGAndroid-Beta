package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class kp0 extends s4.s0 {
    public final int f35129a;
    public final qp0 f35130b;

    public kp0(qp0 qp0Var, int i10) {
        this.f35130b = qp0Var;
        this.f35129a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.k5 k5Var;
        ah.i iVar;
        qp0 qp0Var = this.f35130b;
        wp0 wp0Var = qp0Var.f36807p0;
        if (i11 != 0) {
            wp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (iVar = wp0Var.f39397f0) != null) {
            iVar.f(i10, i11);
        }
        qp0Var.h();
        if (qp0Var.K != null) {
            if (qp0Var.J != null && qp0Var.c()) {
                qp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f35129a == 1) {
            k5Var = wp0Var.f39392c;
        } else {
            k5Var = wp0Var.f39390b;
        }
        if (k5Var != null && qp0Var.c()) {
            k5Var.a();
        }
    }
}
