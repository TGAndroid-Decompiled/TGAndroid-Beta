package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p90 extends g.p {
    public final v90 f38541c;

    public p90(v90 v90Var) {
        this.f38541c = v90Var;
    }

    @Override
    public final int i(int i7) {
        v90 v90Var = this.f38541c;
        jg.h1 h1Var = v90Var.f40745f;
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
            o90 o90Var = v90Var.d;
            o90Var.B1();
            return o90Var.R.get(i7);
        }
        return 100;
    }
}
