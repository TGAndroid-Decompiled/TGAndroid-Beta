package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class bw extends v4.t {
    public final ry Q;

    public bw(ry ryVar) {
        super(5);
        this.Q = ryVar;
    }

    @Override
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int o02 = super.o0(i7, x0Var, c1Var);
        ry ryVar = this.Q;
        if (o02 != 0 && ryVar.E0.getScrollState() == 1) {
            ryVar.Y1 = false;
            ryVar.Z();
        }
        if (ryVar.U0 == null) {
            jg.d1 d1Var = new jg.d1(ryVar, ryVar.f39345d1, ryVar.f39397u1.a(), ryVar.f39397u1.f(), 1);
            ryVar.U0 = d1Var;
            d1Var.a();
        }
        ryVar.U0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        try {
            pi.l lVar = new pi.l(recyclerView.getContext(), 2);
            lVar.f59067a = i7;
            w0(lVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
