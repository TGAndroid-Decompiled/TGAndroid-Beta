package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ta0 extends g.p {
    public final za0 f28464c;

    public ta0(za0 za0Var) {
        this.f28464c = za0Var;
    }

    @Override
    public final int i(int i10) {
        za0 za0Var = this.f28464c;
        gg.k1 k1Var = za0Var.f30827f;
        if (i10 != 0) {
            int i11 = i10 - 1;
            Object J = k1Var.J(i11);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (k1Var.I() != null || k1Var.U != null) {
                i10 = i11;
            }
            sa0 sa0Var = za0Var.d;
            sa0Var.B1();
            return sa0Var.R.get(i10);
        }
        return 100;
    }
}
