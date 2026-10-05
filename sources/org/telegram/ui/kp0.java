package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class kp0 extends s4.s0 {
    public final int f38144a;
    public final qp0 f38145b;

    public kp0(qp0 qp0Var, int i10) {
        this.f38145b = qp0Var;
        this.f38144a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.l5 l5Var;
        qp0 qp0Var = this.f38145b;
        wp0 wp0Var = qp0Var.f39849p0;
        qp0Var.h();
        if (qp0Var.K != null) {
            if (qp0Var.J != null && qp0Var.c()) {
                qp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f38144a == 1) {
            l5Var = wp0Var.f42650c;
        } else {
            l5Var = wp0Var.f42648b;
        }
        if (l5Var != null && qp0Var.c()) {
            l5Var.a();
        }
    }
}
