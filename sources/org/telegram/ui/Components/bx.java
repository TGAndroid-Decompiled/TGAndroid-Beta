package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class bx extends s4.s {
    public final tz Q;

    public bx(tz tzVar) {
        super(5);
        this.Q = tzVar;
    }

    @Override
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int o02 = super.o0(i10, eVar, y0Var);
        tz tzVar = this.Q;
        if (o02 != 0 && tzVar.D0.getScrollState() == 1) {
            tzVar.X1 = false;
            tzVar.Y();
        }
        if (tzVar.T0 == null) {
            hg.f1 f1Var = new hg.f1(tzVar, tzVar.f30768c1, tzVar.f30821t1.a(), tzVar.f30821t1.f(), 1);
            tzVar.T0 = f1Var;
            f1Var.a();
        }
        tzVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        try {
            li.n nVar = new li.n(recyclerView.getContext(), 2);
            nVar.f46053a = i10;
            w0(nVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
