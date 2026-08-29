package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ea0 extends f2.v {
    public final ka0 f27987c;

    public ea0(ka0 ka0Var) {
        this.f27987c = ka0Var;
    }

    @Override
    public final int i(int i10) {
        ka0 ka0Var = this.f27987c;
        rf.v0 v0Var = ka0Var.f29999f;
        if (i10 != 0) {
            int i11 = i10 - 1;
            Object J = v0Var.J(i11);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (v0Var.I() != null || v0Var.Q != null) {
                i10 = i11;
            }
            da0 da0Var = ka0Var.d;
            da0Var.B1();
            return da0Var.R.get(i10);
        }
        return 100;
    }
}
