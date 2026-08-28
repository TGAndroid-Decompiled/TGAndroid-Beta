package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class po0 extends f2.d1 {
    public final int f41569a;
    public final uo0 f41570b;

    public po0(uo0 uo0Var, int i9) {
        this.f41570b = uo0Var;
        this.f41569a = i9;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        gh.n7 n7Var;
        uo0 uo0Var = this.f41570b;
        zo0 zo0Var = uo0Var.f43287f0;
        if (uo0Var.B != null) {
            if (uo0Var.A != null && uo0Var.c()) {
                uo0Var.A.g(false);
                return;
            }
            return;
        }
        if (this.f41569a == 1) {
            n7Var = zo0Var.f45194c;
        } else {
            n7Var = zo0Var.f45193b;
        }
        if (n7Var != null && uo0Var.c()) {
            n7Var.a();
        }
    }
}
