package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class uw extends s4.s {
    public final kz Q;

    public uw(kz kzVar) {
        super(5);
        this.Q = kzVar;
    }

    @Override
    public final int o0(int i10, pf.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        kz kzVar = this.Q;
        if (o02 != 0 && kzVar.D0.getScrollState() == 1) {
            kzVar.X1 = false;
            kzVar.a0();
        }
        if (kzVar.T0 == null) {
            hg.g1 g1Var = new hg.g1(kzVar, kzVar.f27959c1, kzVar.f28013t1.a(), kzVar.f28013t1.f(), 1);
            kzVar.T0 = g1Var;
            g1Var.a();
        }
        kzVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ki.p pVar = new ki.p(recyclerView.getContext(), 2);
            pVar.f45934a = i10;
            w0(pVar);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
