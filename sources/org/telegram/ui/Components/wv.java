package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class wv extends v4.s {
    public final ly Q;

    public wv(ly lyVar) {
        super(5);
        this.Q = lyVar;
    }

    @Override
    public final int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        int o02 = super.o0(i7, w0Var, b1Var);
        ly lyVar = this.Q;
        if (o02 != 0 && lyVar.E0.getScrollState() == 1) {
            lyVar.Y1 = false;
            lyVar.Z();
        }
        if (lyVar.U0 == null) {
            jg.d1 d1Var = new jg.d1(lyVar, lyVar.f36941d1, lyVar.f36993u1.a(), lyVar.f36993u1.f(), 1);
            lyVar.U0 = d1Var;
            d1Var.a();
        }
        lyVar.U0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        try {
            pi.l lVar = new pi.l(recyclerView.getContext(), 2);
            lVar.f58480a = i7;
            w0(lVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
