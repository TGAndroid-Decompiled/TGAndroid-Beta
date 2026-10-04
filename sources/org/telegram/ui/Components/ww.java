package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class ww extends s4.s {
    public final nz Q;

    public ww(nz nzVar) {
        super(5);
        this.Q = nzVar;
    }

    @Override
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        nz nzVar = this.Q;
        if (o02 != 0 && nzVar.D0.getScrollState() == 1) {
            nzVar.X1 = false;
            nzVar.X();
        }
        if (nzVar.T0 == null) {
            gg.g1 g1Var = new gg.g1(nzVar, nzVar.f29097c1, nzVar.f29151t1.a(), nzVar.f29151t1.f(), 1);
            nzVar.T0 = g1Var;
            g1Var.a();
        }
        nzVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.f46699a = i10;
            w0(oVar);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
