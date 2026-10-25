package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class ax extends s4.t {
    public final sz Q;

    public ax(sz szVar) {
        super(5);
        this.Q = szVar;
    }

    @Override
    public final int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        int o02 = super.o0(i10, eVar, b1Var);
        sz szVar = this.Q;
        if (o02 != 0 && szVar.D0.getScrollState() == 1) {
            szVar.X1 = false;
            szVar.Y();
        }
        if (szVar.T0 == null) {
            ig.f1 f1Var = new ig.f1(szVar, szVar.f32716c1, szVar.f32769t1.a(), szVar.f32769t1.f(), 1);
            szVar.T0 = f1Var;
            f1Var.a();
        }
        szVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        try {
            mi.n nVar = new mi.n(recyclerView.getContext(), 2);
            nVar.f47677a = i10;
            w0(nVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
