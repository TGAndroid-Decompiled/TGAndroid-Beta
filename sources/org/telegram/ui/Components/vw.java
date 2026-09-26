package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class vw extends s4.s {
    public final mz Q;

    public vw(mz mzVar) {
        super(5);
        this.Q = mzVar;
    }

    @Override
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        mz mzVar = this.Q;
        if (o02 != 0 && mzVar.D0.getScrollState() == 1) {
            mzVar.X1 = false;
            mzVar.Y();
        }
        if (mzVar.T0 == null) {
            gg.g1 g1Var = new gg.g1(mzVar, mzVar.f26548c1, mzVar.f26601t1.a(), mzVar.f26601t1.f(), 1);
            mzVar.T0 = g1Var;
            g1Var.a();
        }
        mzVar.T0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.f43109a = i10;
            w0(oVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
