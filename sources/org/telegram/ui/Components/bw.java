package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class bw extends v4.t {
    public final qy Q;

    public bw(qy qyVar) {
        super(5);
        this.Q = qyVar;
    }

    @Override
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int o02 = super.o0(i7, x0Var, c1Var);
        qy qyVar = this.Q;
        if (o02 != 0 && qyVar.E0.getScrollState() == 1) {
            qyVar.Y1 = false;
            qyVar.Z();
        }
        if (qyVar.U0 == null) {
            jg.d1 d1Var = new jg.d1(qyVar, qyVar.f39047d1, qyVar.f39099u1.a(), qyVar.f39099u1.f(), 1);
            qyVar.U0 = d1Var;
            d1Var.a();
        }
        qyVar.U0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        try {
            pi.l lVar = new pi.l(recyclerView.getContext(), 2);
            lVar.f59190a = i7;
            w0(lVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
