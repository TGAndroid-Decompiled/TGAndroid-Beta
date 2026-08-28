package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class q90 extends f2.x {
    public final w90 f31872c;

    public q90(w90 w90Var) {
        this.f31872c = w90Var;
    }

    @Override
    public final int i(int i9) {
        w90 w90Var = this.f31872c;
        of.f1 f1Var = w90Var.f34159f;
        if (i9 != 0) {
            int i10 = i9 - 1;
            Object J = f1Var.J(i10);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (f1Var.I() != null || f1Var.Q != null) {
                i9 = i10;
            }
            p90 p90Var = w90Var.d;
            p90Var.B1();
            return p90Var.R.get(i9);
        }
        return 100;
    }
}
