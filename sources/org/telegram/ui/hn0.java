package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class hn0 extends s4.s0 {
    public final int f38002a;
    public final nn0 f38003b;

    public hn0(nn0 nn0Var, int i10) {
        this.f38003b = nn0Var;
        this.f38002a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rh.v5 v5Var;
        nn0 nn0Var = this.f38003b;
        tn0 tn0Var = nn0Var.f40001p0;
        nn0Var.h();
        if (nn0Var.K != null) {
            if (nn0Var.J != null && nn0Var.c()) {
                nn0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f38002a == 1) {
            v5Var = tn0Var.f41872c;
        } else {
            v5Var = tn0Var.f41870b;
        }
        if (v5Var != null && nn0Var.c()) {
            v5Var.b();
        }
    }
}
