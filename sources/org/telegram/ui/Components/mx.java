package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class mx extends s4.s {
    public final d00 Q;

    public mx(d00 d00Var) {
        super(5);
        this.Q = d00Var;
    }

    @Override
    public final int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        int o02 = super.o0(i10, eVar, a1Var);
        d00 d00Var = this.Q;
        if (o02 != 0 && d00Var.D0.getScrollState() == 1) {
            d00Var.X1 = false;
            d00Var.Y();
        }
        if (d00Var.T0 == null) {
            gg.f1 f1Var = new gg.f1(d00Var, d00Var.f25072c1, d00Var.f25126t1.a(), d00Var.f25126t1.f(), 1);
            d00Var.T0 = f1Var;
            f1Var.a();
        }
        d00Var.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.f48066a = i10;
            w0(oVar);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
