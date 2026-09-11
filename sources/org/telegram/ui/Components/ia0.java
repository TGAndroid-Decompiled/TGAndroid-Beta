package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ia0 extends g.p {
    public final oa0 f27057c;

    public ia0(oa0 oa0Var) {
        this.f27057c = oa0Var;
    }

    @Override
    public final int i(int i10) {
        oa0 oa0Var = this.f27057c;
        hg.k1 k1Var = oa0Var.f29021f;
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
            ha0 ha0Var = oa0Var.d;
            ha0Var.B1();
            return ha0Var.R.get(i10);
        }
        return 100;
    }
}
