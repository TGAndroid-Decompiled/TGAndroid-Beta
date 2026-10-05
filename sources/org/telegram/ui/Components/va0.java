package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class va0 extends g.p {
    public final bb0 f31699c;

    public va0(bb0 bb0Var) {
        this.f31699c = bb0Var;
    }

    @Override
    public final int i(int i10) {
        bb0 bb0Var = this.f31699c;
        gg.k1 k1Var = bb0Var.f24930f;
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
            ua0 ua0Var = bb0Var.d;
            ua0Var.B1();
            return ua0Var.R.get(i10);
        }
        return 100;
    }
}
