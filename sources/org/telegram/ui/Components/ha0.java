package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ha0 extends g.p {
    public final na0 f24622c;

    public ha0(na0 na0Var) {
        this.f24622c = na0Var;
    }

    @Override
    public final int i(int i10) {
        na0 na0Var = this.f24622c;
        gg.k1 k1Var = na0Var.f26430f;
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
            ga0 ga0Var = na0Var.d;
            ga0Var.B1();
            return ga0Var.R.get(i10);
        }
        return 100;
    }
}
