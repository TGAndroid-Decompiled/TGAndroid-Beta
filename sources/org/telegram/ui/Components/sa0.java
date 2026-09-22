package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class sa0 extends g.p {
    public final ya0 f28150c;

    public sa0(ya0 ya0Var) {
        this.f28150c = ya0Var;
    }

    @Override
    public final int i(int i10) {
        ya0 ya0Var = this.f28150c;
        gg.k1 k1Var = ya0Var.f30618f;
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
            ra0 ra0Var = ya0Var.d;
            ra0Var.B1();
            return ra0Var.R.get(i10);
        }
        return 100;
    }
}
