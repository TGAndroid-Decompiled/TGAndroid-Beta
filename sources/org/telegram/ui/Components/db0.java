package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class db0 extends g.o {
    public final jb0 f25587c;

    public db0(jb0 jb0Var) {
        this.f25587c = jb0Var;
    }

    @Override
    public final int i(int i10) {
        jb0 jb0Var = this.f25587c;
        hg.j1 j1Var = jb0Var.f27655f;
        if (i10 != 0) {
            int i11 = i10 - 1;
            Object J = j1Var.J(i11);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (j1Var.I() != null || j1Var.U != null) {
                i10 = i11;
            }
            cb0 cb0Var = jb0Var.d;
            cb0Var.B1();
            return cb0Var.R.get(i10);
        }
        return 100;
    }
}
