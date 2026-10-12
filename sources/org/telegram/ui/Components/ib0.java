package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ib0 extends g.o {
    public final ob0 f25928c;

    public ib0(ob0 ob0Var) {
        this.f25928c = ob0Var;
    }

    @Override
    public final int i(int i10) {
        ob0 ob0Var = this.f25928c;
        hg.j1 j1Var = ob0Var.f27929f;
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
            hb0 hb0Var = ob0Var.d;
            hb0Var.B1();
            return hb0Var.R.get(i10);
        }
        return 100;
    }
}
