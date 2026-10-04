package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class kp0 extends s4.s0 {
    public final int f38076a;
    public final qp0 f38077b;

    public kp0(qp0 qp0Var, int i10) {
        this.f38077b = qp0Var;
        this.f38076a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.k5 k5Var;
        qp0 qp0Var = this.f38077b;
        wp0 wp0Var = qp0Var.f39788p0;
        qp0Var.h();
        if (qp0Var.K != null) {
            if (qp0Var.J != null && qp0Var.c()) {
                qp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f38076a == 1) {
            k5Var = wp0Var.f42583c;
        } else {
            k5Var = wp0Var.f42581b;
        }
        if (k5Var != null && qp0Var.c()) {
            k5Var.a();
        }
    }
}
