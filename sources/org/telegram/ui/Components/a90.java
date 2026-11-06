package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a90 extends g.p {
    public final g90 f31749c;

    public a90(g90 g90Var) {
        this.f31749c = g90Var;
    }

    @Override
    public final int i(int i7) {
        g90 g90Var = this.f31749c;
        jg.i1 i1Var = g90Var.f33871f;
        if (i7 != 0) {
            int i10 = i7 - 1;
            Object J = i1Var.J(i10);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (i1Var.I() != null || i1Var.U != null) {
                i7 = i10;
            }
            z80 z80Var = g90Var.d;
            z80Var.B1();
            return z80Var.R.get(i7);
        }
        return 100;
    }
}
