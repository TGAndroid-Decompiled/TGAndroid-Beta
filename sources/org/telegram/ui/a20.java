package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class a20 extends v4.s0 {
    public final f40 f43542a;

    public a20(f40 f40Var) {
        this.f43542a = f40Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        f40 f40Var = this.f43542a;
        f40Var.f28672b.invalidate();
        f40Var.U3.invalidate();
    }
}
