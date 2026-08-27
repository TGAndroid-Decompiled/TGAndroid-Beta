package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class u90 extends f2.w {

    public final aa0 f33022c;

    public u90(aa0 aa0Var) {
        this.f33022c = aa0Var;
    }

    @Override
    public final int i(int i10) {
        aa0 aa0Var = this.f33022c;
        pf.u0 u0Var = aa0Var.f26703f;
        if (i10 == 0) {
            return 100;
        }
        int i11 = i10 - 1;
        Object objJ = u0Var.J(i11);
        if (objJ instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (objJ instanceof TLRPC.Document) {
            return 20;
        }
        if (u0Var.I() != null || u0Var.Q != null) {
            i10 = i11;
        }
        t90 t90Var = aa0Var.d;
        t90Var.B1();
        return t90Var.R.get(i10);
    }
}
