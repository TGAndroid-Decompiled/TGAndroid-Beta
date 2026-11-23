package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class dw extends v4.s {
    public final ty Q;

    public dw(ty tyVar) {
        super(5);
        this.Q = tyVar;
    }

    @Override
    public final int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        int o02 = super.o0(i7, w0Var, b1Var);
        ty tyVar = this.Q;
        if (o02 != 0 && tyVar.E0.getScrollState() == 1) {
            tyVar.Y1 = false;
            tyVar.Z();
        }
        if (tyVar.U0 == null) {
            jg.d1 d1Var = new jg.d1(tyVar, tyVar.f40074d1, tyVar.f40126u1.a(), tyVar.f40126u1.f(), 1);
            tyVar.U0 = d1Var;
            d1Var.a();
        }
        tyVar.U0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        try {
            pi.l lVar = new pi.l(recyclerView.getContext(), 2);
            lVar.f59055a = i7;
            w0(lVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
