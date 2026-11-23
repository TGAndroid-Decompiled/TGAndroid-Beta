package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class rw extends v4.t {
    public final qy Q;

    public rw(qy qyVar) {
        super(8);
        this.Q = qyVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        try {
            hi.t1 t1Var = new hi.t1(2, recyclerView.getContext(), this);
            t1Var.f59190a = i7;
            w0(t1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
