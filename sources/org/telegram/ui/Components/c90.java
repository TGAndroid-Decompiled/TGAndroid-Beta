package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c90 extends g.p {
    public final i90 f33530c;

    public c90(i90 i90Var) {
        this.f33530c = i90Var;
    }

    @Override
    public final int i(int i7) {
        i90 i90Var = this.f33530c;
        jg.h1 h1Var = i90Var.f35523f;
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
            b90 b90Var = i90Var.d;
            b90Var.B1();
            return b90Var.R.get(i7);
        }
        return 100;
    }
}
