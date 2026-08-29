package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class oo0 extends f2.a1 {
    public final int f41204a;
    public final to0 f41205b;

    public oo0(to0 to0Var, int i10) {
        this.f41205b = to0Var;
        this.f41204a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jh.k7 k7Var;
        to0 to0Var = this.f41205b;
        yo0 yo0Var = to0Var.f43077f0;
        if (to0Var.B != null) {
            if (to0Var.A != null && to0Var.c()) {
                to0Var.A.g(false);
                return;
            }
            return;
        }
        if (this.f41204a == 1) {
            k7Var = yo0Var.f44943c;
        } else {
            k7Var = yo0Var.f44942b;
        }
        if (k7Var != null && to0Var.c()) {
            k7Var.a();
        }
    }
}
