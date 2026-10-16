package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class fx extends s4.s {
    public final wz Q;

    public fx(wz wzVar) {
        super(5);
        this.Q = wzVar;
    }

    @Override
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int o02 = super.o0(i10, eVar, y0Var);
        wz wzVar = this.Q;
        if (o02 != 0 && wzVar.D0.getScrollState() == 1) {
            wzVar.X1 = false;
            wzVar.Y();
        }
        if (wzVar.T0 == null) {
            hg.f1 f1Var = new hg.f1(wzVar, wzVar.f30707c1, wzVar.f30760t1.a(), wzVar.f30760t1.f(), 1);
            wzVar.T0 = f1Var;
            f1Var.a();
        }
        wzVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        try {
            ki.o oVar = new ki.o(recyclerView.getContext(), 2);
            oVar.f44979a = i10;
            w0(oVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
