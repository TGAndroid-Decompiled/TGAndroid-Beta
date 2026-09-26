package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ua0 extends g.p {
    public final ab0 f28754c;

    public ua0(ab0 ab0Var) {
        this.f28754c = ab0Var;
    }

    @Override
    public final int i(int i10) {
        ab0 ab0Var = this.f28754c;
        gg.k1 k1Var = ab0Var.f22593f;
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
            ta0 ta0Var = ab0Var.d;
            ta0Var.B1();
            return ta0Var.R.get(i10);
        }
        return 100;
    }
}
