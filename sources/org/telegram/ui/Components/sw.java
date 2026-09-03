package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class sw extends f2.w {
    public final mz Q;

    public sw(mz mzVar) {
        super(5);
        this.Q = mzVar;
    }

    @Override
    public final int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        int o02 = super.o0(i10, fVar, j1Var);
        mz mzVar = this.Q;
        if (o02 != 0 && mzVar.A0.getScrollState() == 1) {
            mzVar.U1 = false;
            mzVar.a0();
        }
        if (mzVar.Q0 == null) {
            bx bxVar = new bx(mzVar, mzVar.Z0, mzVar.f29317q1.a(), mzVar.f29317q1.f(), 0);
            mzVar.Q0 = bxVar;
            bxVar.a();
        }
        mzVar.Q0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        try {
            xh.o oVar = new xh.o(recyclerView.getContext(), 2);
            oVar.f5805a = i10;
            w0(oVar);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
