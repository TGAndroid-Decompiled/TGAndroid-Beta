package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class jx extends s4.s {
    public final a00 Q;

    public jx(a00 a00Var) {
        super(5);
        this.Q = a00Var;
    }

    @Override
    public final int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        int o02 = super.o0(i10, eVar, a1Var);
        a00 a00Var = this.Q;
        if (o02 != 0 && a00Var.D0.getScrollState() == 1) {
            a00Var.X1 = false;
            a00Var.Y();
        }
        if (a00Var.T0 == null) {
            gg.f1 f1Var = new gg.f1(a00Var, a00Var.f24401c1, a00Var.f24455t1.a(), a00Var.f24455t1.f(), 1);
            a00Var.T0 = f1Var;
            f1Var.a();
        }
        a00Var.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.f47825a = i10;
            w0(oVar);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
