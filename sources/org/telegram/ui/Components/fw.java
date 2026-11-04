package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class fw extends u4.s {
    public final ey Q;

    public fw(ey eyVar) {
        super(8);
        this.Q = eyVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        try {
            gi.j1 j1Var = new gi.j1(2, recyclerView.getContext(), this);
            j1Var.f55704a = i3;
            w0(j1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
