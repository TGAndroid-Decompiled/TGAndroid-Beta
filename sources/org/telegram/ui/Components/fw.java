package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

public final class fw extends f2.x {
    public final yy Q;

    public fw(yy yyVar) {
        super(5);
        this.Q = yyVar;
    }

    @Override
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        int iO0 = super.o0(i10, e1Var, l1Var);
        yy yyVar = this.Q;
        if (iO0 != 0 && yyVar.f35059z0.getScrollState() == 1) {
            yyVar.T1 = false;
            yyVar.a0();
        }
        if (yyVar.P0 == null) {
            ow owVar = new ow(yyVar, yyVar.Y0, yyVar.f35025p1.a(), yyVar.f35025p1.f(), 0);
            yyVar.P0 = owVar;
            owVar.a();
        }
        yyVar.P0.b();
        return iO0;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        try {
            sh.n nVar = new sh.n(recyclerView.getContext(), 2);
            nVar.f5731a = i10;
            w0(nVar);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
