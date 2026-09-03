package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class qw extends f2.w {
    public final kz Q;

    public qw(kz kzVar) {
        super(5);
        this.Q = kzVar;
    }

    @Override
    public final int o0(int i10, af.h hVar, f2.i1 i1Var) {
        int o02 = super.o0(i10, hVar, i1Var);
        kz kzVar = this.Q;
        if (o02 != 0 && kzVar.A0.getScrollState() == 1) {
            kzVar.U1 = false;
            kzVar.a0();
        }
        if (kzVar.Q0 == null) {
            zw zwVar = new zw(kzVar, kzVar.Z0, kzVar.f26472q1.a(), kzVar.f26472q1.f(), 0);
            kzVar.Q0 = zwVar;
            zwVar.a();
        }
        kzVar.Q0.b();
        return o02;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        try {
            wh.o oVar = new wh.o(recyclerView.getContext(), 2);
            oVar.f5712a = i10;
            w0(oVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
