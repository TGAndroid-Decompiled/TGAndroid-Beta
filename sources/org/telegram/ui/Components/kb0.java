package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class kb0 extends g.o {
    public final qb0 f27920c;

    public kb0(qb0 qb0Var) {
        this.f27920c = qb0Var;
    }

    @Override
    public final int i(int i10) {
        qb0 qb0Var = this.f27920c;
        gg.j1 j1Var = qb0Var.f30116f;
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
            jb0 jb0Var = qb0Var.d;
            jb0Var.B1();
            return jb0Var.R.get(i10);
        }
        return 100;
    }
}
