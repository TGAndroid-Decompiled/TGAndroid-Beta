package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class uw extends v4.s {
    public final ty Q;

    public uw(ty tyVar) {
        super(8);
        this.Q = tyVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        try {
            hi.k1 k1Var = new hi.k1(2, recyclerView.getContext(), this);
            k1Var.f59055a = i7;
            w0(k1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
