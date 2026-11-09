package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class b90 extends g.p {
    public final h90 f32196c;

    public b90(h90 h90Var) {
        this.f32196c = h90Var;
    }

    @Override
    public final int i(int i7) {
        h90 h90Var = this.f32196c;
        jg.i1 i1Var = h90Var.f34250f;
        if (i7 != 0) {
            int i10 = i7 - 1;
            Object J = i1Var.J(i10);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (i1Var.I() != null || i1Var.U != null) {
                i7 = i10;
            }
            a90 a90Var = h90Var.d;
            a90Var.B1();
            return a90Var.R.get(i7);
        }
        return 100;
    }
}
