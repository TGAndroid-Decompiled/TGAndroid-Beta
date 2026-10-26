package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ab0 extends g.o {
    public final gb0 f26462c;

    public ab0(gb0 gb0Var) {
        this.f26462c = gb0Var;
    }

    @Override
    public final int i(int i10) {
        gb0 gb0Var = this.f26462c;
        ig.j1 j1Var = gb0Var.f28522f;
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
            za0 za0Var = gb0Var.d;
            za0Var.C1();
            return za0Var.R.get(i10);
        }
        return 100;
    }
}
