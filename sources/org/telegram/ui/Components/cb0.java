package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cb0 extends g.o {
    public final ib0 f25163c;

    public cb0(ib0 ib0Var) {
        this.f25163c = ib0Var;
    }

    @Override
    public final int i(int i10) {
        ib0 ib0Var = this.f25163c;
        hg.j1 j1Var = ib0Var.f27186f;
        if (i10 != 0) {
            int i11 = i10 - 1;
            Object J = j1Var.J(i11);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (j1Var.I() != null || j1Var.U != null) {
                i10 = i11;
            }
            bb0 bb0Var = ib0Var.d;
            bb0Var.B1();
            return bb0Var.R.get(i10);
        }
        return 100;
    }
}
