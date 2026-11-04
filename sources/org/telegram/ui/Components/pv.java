package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class pv extends u4.s {
    public final ey Q;

    public pv(ey eyVar) {
        super(5);
        this.Q = eyVar;
    }

    @Override
    public final int o0(int i3, tf.e eVar, u4.a1 a1Var) {
        int o02 = super.o0(i3, eVar, a1Var);
        ey eyVar = this.Q;
        if (o02 != 0 && eyVar.E0.getScrollState() == 1) {
            eyVar.Y1 = false;
            eyVar.Z();
        }
        if (eyVar.U0 == null) {
            kg.a1 a1Var2 = new kg.a1(eyVar, eyVar.f33529d1, eyVar.f33582u1.a(), eyVar.f33582u1.f(), 1);
            eyVar.U0 = a1Var2;
            a1Var2.a();
        }
        eyVar.U0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        try {
            ni.m mVar = new ni.m(recyclerView.getContext(), 2);
            mVar.f55704a = i3;
            w0(mVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
