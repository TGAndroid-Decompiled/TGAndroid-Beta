package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ew extends v4.t {
    public final ty Q;

    public ew(ty tyVar) {
        super(5);
        this.Q = tyVar;
    }

    @Override
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int o02 = super.o0(i7, x0Var, c1Var);
        ty tyVar = this.Q;
        if (o02 != 0 && tyVar.E0.getScrollState() == 1) {
            tyVar.Y1 = false;
            tyVar.Z();
        }
        if (tyVar.U0 == null) {
            jg.d1 d1Var = new jg.d1(tyVar, tyVar.f40091d1, tyVar.f40143u1.a(), tyVar.f40143u1.f(), 1);
            tyVar.U0 = d1Var;
            d1Var.a();
        }
        tyVar.U0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        try {
            pi.l lVar = new pi.l(recyclerView.getContext(), 2);
            lVar.f59109a = i7;
            w0(lVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
