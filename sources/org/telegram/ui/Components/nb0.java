package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nb0 extends g.o {
    public final tb0 f28773c;

    public nb0(tb0 tb0Var) {
        this.f28773c = tb0Var;
    }

    @Override
    public final int i(int i10) {
        tb0 tb0Var = this.f28773c;
        gg.j1 j1Var = tb0Var.f30842f;
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
            mb0 mb0Var = tb0Var.d;
            mb0Var.B1();
            return mb0Var.R.get(i10);
        }
        return 100;
    }
}
