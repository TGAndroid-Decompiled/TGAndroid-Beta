package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pa0 extends g.p {
    public final va0 f27243c;

    public pa0(va0 va0Var) {
        this.f27243c = va0Var;
    }

    @Override
    public final int i(int i10) {
        va0 va0Var = this.f27243c;
        gg.k1 k1Var = va0Var.f29048f;
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
            oa0 oa0Var = va0Var.d;
            oa0Var.B1();
            return oa0Var.R.get(i10);
        }
        return 100;
    }
}
