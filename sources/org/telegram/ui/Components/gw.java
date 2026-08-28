package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class gw extends f2.y {
    public final wy Q;

    public gw(wy wyVar) {
        super(5);
        this.Q = wyVar;
    }

    @Override
    public final int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        int o02 = super.o0(i9, g1Var, n1Var);
        wy wyVar = this.Q;
        if (o02 != 0 && wyVar.f34466z0.getScrollState() == 1) {
            wyVar.T1 = false;
            wyVar.Z();
        }
        if (wyVar.P0 == null) {
            of.b1 b1Var = new of.b1(wyVar, wyVar.Y0, wyVar.f34432p1.a(), wyVar.f34432p1.f(), 1);
            wyVar.P0 = b1Var;
            b1Var.a();
        }
        wyVar.P0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        try {
            rh.n nVar = new rh.n(recyclerView.getContext(), 2);
            nVar.f5443a = i9;
            w0(nVar);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
