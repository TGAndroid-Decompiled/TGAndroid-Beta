package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class jb0 extends g.o {
    public final pb0 f27704c;

    public jb0(pb0 pb0Var) {
        this.f27704c = pb0Var;
    }

    @Override
    public final int i(int i10) {
        pb0 pb0Var = this.f27704c;
        gg.j1 j1Var = pb0Var.f29832f;
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
            ib0 ib0Var = pb0Var.d;
            ib0Var.B1();
            return ib0Var.R.get(i10);
        }
        return 100;
    }
}
