package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class m90 extends g.p {
    public final s90 f37430c;

    public m90(s90 s90Var) {
        this.f37430c = s90Var;
    }

    @Override
    public final int i(int i7) {
        s90 s90Var = this.f37430c;
        jg.h1 h1Var = s90Var.f39538f;
        if (i7 != 0) {
            int i10 = i7 - 1;
            Object J = h1Var.J(i10);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (h1Var.I() != null || h1Var.V != null) {
                i7 = i10;
            }
            l90 l90Var = s90Var.d;
            l90Var.B1();
            return l90Var.R.get(i7);
        }
        return 100;
    }
}
