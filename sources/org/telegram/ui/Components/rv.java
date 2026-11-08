package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class rv extends v4.s {
    public final hy Q;

    public rv(hy hyVar) {
        super(5);
        this.Q = hyVar;
    }

    @Override
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int o02 = super.o0(i7, v0Var, a1Var);
        hy hyVar = this.Q;
        if (o02 != 0 && hyVar.D0.getScrollState() == 1) {
            hyVar.X1 = false;
            hyVar.Z();
        }
        if (hyVar.T0 == null) {
            jg.e1 e1Var = new jg.e1(hyVar, hyVar.f34400c1, hyVar.f34452t1.a(), hyVar.f34452t1.f(), 1);
            hyVar.T0 = e1Var;
            e1Var.a();
        }
        hyVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        try {
            mi.m mVar = new mi.m(recyclerView.getContext(), 2);
            mVar.f57213a = i7;
            w0(mVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
