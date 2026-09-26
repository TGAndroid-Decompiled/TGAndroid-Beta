package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class uw extends s4.s {
    public final lz Q;

    public uw(lz lzVar) {
        super(5);
        this.Q = lzVar;
    }

    @Override
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        lz lzVar = this.Q;
        if (o02 != 0 && lzVar.D0.getScrollState() == 1) {
            lzVar.X1 = false;
            lzVar.Y();
        }
        if (lzVar.T0 == null) {
            gg.g1 g1Var = new gg.g1(lzVar, lzVar.f26236c1, lzVar.f26289t1.a(), lzVar.f26289t1.f(), 1);
            lzVar.T0 = g1Var;
            g1Var.a();
        }
        lzVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.f43110a = i10;
            w0(oVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
