package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class vw extends s4.r {
    public final vy Q;

    public vw(vy vyVar) {
        super(8);
        this.Q = vyVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            qw qwVar = new qw(this, recyclerView.getContext(), 1);
            qwVar.f48056a = i10;
            w0(qwVar);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
