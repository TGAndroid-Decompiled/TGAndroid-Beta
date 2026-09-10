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
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        rz rzVar = this.Q;
        if (o02 != 0 && rzVar.D0.getScrollState() == 1) {
            rzVar.X1 = false;
            rzVar.a0();
        }
        if (rzVar.T0 == null) {
            fg.h1 h1Var = new fg.h1(rzVar, rzVar.f26805c1, rzVar.f26858t1.a(), rzVar.f26858t1.f(), 1);
            rzVar.T0 = h1Var;
            h1Var.a();
        }
        rzVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ii.o oVar = new ii.o(recyclerView.getContext(), 2);
            oVar.f41760a = i10;
            w0(oVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
