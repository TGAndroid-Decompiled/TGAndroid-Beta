package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class sw extends v4.t {
    public final ry Q;

    public sw(ry ryVar) {
        super(8);
        this.Q = ryVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        try {
            hi.l1 l1Var = new hi.l1(2, recyclerView.getContext(), this);
            l1Var.f59067a = i7;
            w0(l1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
