package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class hw extends v4.s {
    public final hy Q;

    public hw(hy hyVar) {
        super(8);
        this.Q = hyVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        try {
            fi.j1 j1Var = new fi.j1(2, recyclerView.getContext(), this);
            j1Var.f57225a = i7;
            w0(j1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
