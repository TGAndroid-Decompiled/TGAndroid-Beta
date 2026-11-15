package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d90 extends g.p {
    public final j90 f33892c;

    public d90(j90 j90Var) {
        this.f33892c = j90Var;
    }

    @Override
    public final int i(int i7) {
        j90 j90Var = this.f33892c;
        jg.h1 h1Var = j90Var.f35923f;
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
            c90 c90Var = j90Var.d;
            c90Var.B1();
            return c90Var.R.get(i7);
        }
        return 100;
    }
}
