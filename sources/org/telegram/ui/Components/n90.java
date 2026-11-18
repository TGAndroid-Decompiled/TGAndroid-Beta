package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class n90 extends g.p {
    public final t90 f37756c;

    public n90(t90 t90Var) {
        this.f37756c = t90Var;
    }

    @Override
    public final int i(int i7) {
        t90 t90Var = this.f37756c;
        jg.h1 h1Var = t90Var.f39949f;
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
            m90 m90Var = t90Var.d;
            m90Var.B1();
            return m90Var.R.get(i7);
        }
        return 100;
    }
}
