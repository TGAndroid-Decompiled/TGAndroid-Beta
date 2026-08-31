package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class la0 extends f2.v {
    public final ra0 f28681c;

    public la0(ra0 ra0Var) {
        this.f28681c = ra0Var;
    }

    @Override
    public final int i(int i10) {
        ra0 ra0Var = this.f28681c;
        uf.u0 u0Var = ra0Var.f30663f;
        if (i10 != 0) {
            int i11 = i10 - 1;
            Object J = u0Var.J(i11);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (u0Var.I() != null || u0Var.R != null) {
                i10 = i11;
            }
            ka0 ka0Var = ra0Var.d;
            ka0Var.B1();
            return ka0Var.R.get(i10);
        }
        return 100;
    }
}
