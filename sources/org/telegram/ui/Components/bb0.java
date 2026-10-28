package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class bb0 extends g.o {
    public final hb0 f26799c;

    public bb0(hb0 hb0Var) {
        this.f26799c = hb0Var;
    }

    @Override
    public final int i(int i10) {
        hb0 hb0Var = this.f26799c;
        ig.j1 j1Var = hb0Var.f28943f;
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
            ab0 ab0Var = hb0Var.d;
            ab0Var.C1();
            return ab0Var.R.get(i10);
        }
        return 100;
    }
}
