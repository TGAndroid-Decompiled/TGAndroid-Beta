package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class tw extends s4.s {
    public final kz Q;

    public tw(kz kzVar) {
        super(5);
        this.Q = kzVar;
    }

    @Override
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        kz kzVar = this.Q;
        if (o02 != 0 && kzVar.D0.getScrollState() == 1) {
            kzVar.X1 = false;
            kzVar.Z();
        }
        if (kzVar.T0 == null) {
            gg.g1 g1Var = new gg.g1(kzVar, kzVar.f25703c1, kzVar.f25756t1.a(), kzVar.f25756t1.f(), 1);
            kzVar.T0 = g1Var;
            g1Var.a();
        }
        kzVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.f42825a = i10;
            w0(oVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
