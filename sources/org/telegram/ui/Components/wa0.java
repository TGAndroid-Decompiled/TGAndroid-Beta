package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wa0 extends g.p {
    public final cb0 f29880c;

    public wa0(cb0 cb0Var) {
        this.f29880c = cb0Var;
    }

    @Override
    public final int i(int i10) {
        cb0 cb0Var = this.f29880c;
        gg.k1 k1Var = cb0Var.f23250f;
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
            va0 va0Var = cb0Var.d;
            va0Var.B1();
            return va0Var.R.get(i10);
        }
        return 100;
    }
}
