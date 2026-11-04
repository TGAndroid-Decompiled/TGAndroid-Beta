package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class w80 extends g.p {
    public final c90 f39970c;

    public w80(c90 c90Var) {
        this.f39970c = c90Var;
    }

    @Override
    public final int i(int i3) {
        c90 c90Var = this.f39970c;
        kg.e1 e1Var = c90Var.f32614f;
        if (i3 != 0) {
            int i10 = i3 - 1;
            Object J = e1Var.J(i10);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (e1Var.I() != null || e1Var.V != null) {
                i3 = i10;
            }
            v80 v80Var = c90Var.d;
            v80Var.B1();
            return v80Var.R.get(i3);
        }
        return 100;
    }
}
