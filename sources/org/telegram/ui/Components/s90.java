package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class s90 extends g.o {
    public final y90 f30252c;

    public s90(y90 y90Var) {
        this.f30252c = y90Var;
    }

    @Override
    public final int i(int i10) {
        y90 y90Var = this.f30252c;
        zf.x0 x0Var = y90Var.f32783f;
        if (i10 != 0) {
            int i11 = i10 - 1;
            Object J = x0Var.J(i11);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (x0Var.I() != null || x0Var.U != null) {
                i10 = i11;
            }
            r90 r90Var = y90Var.d;
            r90Var.B1();
            return r90Var.R.get(i10);
        }
        return 100;
    }
}
