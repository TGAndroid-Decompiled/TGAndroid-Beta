package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class zw extends s4.s {
    public final rz Q;

    public zw(rz rzVar) {
        super(5);
        this.Q = rzVar;
    }

    @Override
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int o02 = super.o0(i10, eVar, y0Var);
        rz rzVar = this.Q;
        if (o02 != 0 && rzVar.D0.getScrollState() == 1) {
            rzVar.X1 = false;
            rzVar.Y();
        }
        if (rzVar.T0 == null) {
            hg.f1 f1Var = new hg.f1(rzVar, rzVar.f30310c1, rzVar.f30363t1.a(), rzVar.f30363t1.f(), 1);
            rzVar.T0 = f1Var;
            f1Var.a();
        }
        rzVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        try {
            li.n nVar = new li.n(recyclerView.getContext(), 2);
            nVar.f46483a = i10;
            w0(nVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
