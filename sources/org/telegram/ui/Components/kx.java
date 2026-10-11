package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class kx extends s4.s {
    public final b00 Q;

    public kx(b00 b00Var) {
        super(5);
        this.Q = b00Var;
    }

    @Override
    public final int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        int o02 = super.o0(i10, eVar, a1Var);
        b00 b00Var = this.Q;
        if (o02 != 0 && b00Var.D0.getScrollState() == 1) {
            b00Var.X1 = false;
            b00Var.Y();
        }
        if (b00Var.T0 == null) {
            gg.f1 f1Var = new gg.f1(b00Var, b00Var.f24731c1, b00Var.f24785t1.a(), b00Var.f24785t1.f(), 1);
            b00Var.T0 = f1Var;
            f1Var.a();
        }
        b00Var.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.f47951a = i10;
            w0(oVar);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
