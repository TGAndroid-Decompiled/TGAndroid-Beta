package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class fp0 extends s4.u0 {
    public final int f39434a;
    public final lp0 f39435b;

    public fp0(lp0 lp0Var, int i10) {
        this.f39435b = lp0Var;
        this.f39434a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bi.t9 t9Var;
        lp0 lp0Var = this.f39435b;
        rp0 rp0Var = lp0Var.f41333p0;
        lp0Var.h();
        if (lp0Var.K != null) {
            if (lp0Var.J != null && lp0Var.c()) {
                lp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f39434a == 1) {
            t9Var = rp0Var.f43229c;
        } else {
            t9Var = rp0Var.f43227b;
        }
        if (t9Var != null && lp0Var.c()) {
            t9Var.b();
        }
    }
}
