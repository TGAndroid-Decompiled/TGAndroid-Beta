package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class mw extends v4.s {
    public final ly Q;

    public mw(ly lyVar) {
        super(8);
        this.Q = lyVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        try {
            hi.l1 l1Var = new hi.l1(2, recyclerView.getContext(), this);
            l1Var.f58480a = i7;
            w0(l1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
