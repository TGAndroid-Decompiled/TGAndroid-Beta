package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class fn0 extends s4.s0 {
    public final int f37192a;
    public final ln0 f37193b;

    public fn0(ln0 ln0Var, int i10) {
        this.f37193b = ln0Var;
        this.f37192a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rh.v5 v5Var;
        ln0 ln0Var = this.f37193b;
        rn0 rn0Var = ln0Var.f39334p0;
        ln0Var.h();
        if (ln0Var.K != null) {
            if (ln0Var.J != null && ln0Var.c()) {
                ln0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f37192a == 1) {
            v5Var = rn0Var.f41114c;
        } else {
            v5Var = rn0Var.f41112b;
        }
        if (v5Var != null && ln0Var.c()) {
            v5Var.b();
        }
    }
}
