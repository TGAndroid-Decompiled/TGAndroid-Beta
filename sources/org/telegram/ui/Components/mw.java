package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class mw extends f2.w {
    public final fz Q;

    public mw(fz fzVar) {
        super(5);
        this.Q = fzVar;
    }

    @Override
    public final int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        int o02 = super.o0(i10, d1Var, k1Var);
        fz fzVar = this.Q;
        if (o02 != 0 && fzVar.f28657z0.getScrollState() == 1) {
            fzVar.T1 = false;
            fzVar.a0();
        }
        if (fzVar.P0 == null) {
            vw vwVar = new vw(fzVar, fzVar.Y0, fzVar.f28623p1.a(), fzVar.f28623p1.f(), 0);
            fzVar.P0 = vwVar;
            vwVar.a();
        }
        fzVar.P0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        try {
            uh.n nVar = new uh.n(recyclerView.getContext(), 2);
            nVar.f6373a = i10;
            w0(nVar);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
