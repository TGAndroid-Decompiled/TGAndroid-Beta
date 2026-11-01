package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class cw extends s4.r {
    public final vy Q;

    public cw(vy vyVar) {
        super(5);
        this.Q = vyVar;
    }

    @Override
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        vy vyVar = this.Q;
        if (o02 != 0 && vyVar.D0.getScrollState() == 1) {
            vyVar.X1 = false;
            vyVar.Z();
        }
        if (vyVar.T0 == null) {
            mw mwVar = new mw(vyVar, vyVar.f31943c1, vyVar.f31996t1.a(), vyVar.f31996t1.f(), 0);
            vyVar.T0 = mwVar;
            mwVar.a();
        }
        vyVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ci.p pVar = new ci.p(recyclerView.getContext(), 2);
            pVar.f48056a = i10;
            w0(pVar);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
