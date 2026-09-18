package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qa0 extends g.p {
    public final wa0 f27541c;

    public qa0(wa0 wa0Var) {
        this.f27541c = wa0Var;
    }

    @Override
    public final int i(int i10) {
        wa0 wa0Var = this.f27541c;
        gg.k1 k1Var = wa0Var.f30006f;
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
            pa0 pa0Var = wa0Var.d;
            pa0Var.B1();
            return pa0Var.R.get(i10);
        }
        return 100;
    }
}
