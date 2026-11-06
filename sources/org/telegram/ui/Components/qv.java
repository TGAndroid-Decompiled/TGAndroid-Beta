package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class qv extends v4.s {
    public final gy Q;

    public qv(gy gyVar) {
        super(5);
        this.Q = gyVar;
    }

    @Override
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int o02 = super.o0(i7, v0Var, a1Var);
        gy gyVar = this.Q;
        if (o02 != 0 && gyVar.D0.getScrollState() == 1) {
            gyVar.X1 = false;
            gyVar.Z();
        }
        if (gyVar.T0 == null) {
            jg.e1 e1Var = new jg.e1(gyVar, gyVar.f34076c1, gyVar.f34128t1.a(), gyVar.f34128t1.f(), 1);
            gyVar.T0 = e1Var;
            e1Var.a();
        }
        gyVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        try {
            mi.m mVar = new mi.m(recyclerView.getContext(), 2);
            mVar.f57096a = i7;
            w0(mVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
