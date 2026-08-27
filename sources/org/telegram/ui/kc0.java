package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

public final class kc0 extends f2.b1 {

    public final tc0 f39695a;

    public kc0(tc0 tc0Var) {
        this.f39695a = tc0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        tc0 tc0Var = this.f39695a;
        tc0Var.M = z10;
        if (z10 || tc0Var.H == null) {
            return;
        }
        tc0Var.H = null;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        tc0 tc0Var = this.f39695a;
        tc0Var.A0(false);
        if (tc0Var.H != null) {
            tc0Var.J += i11;
        }
    }
}
