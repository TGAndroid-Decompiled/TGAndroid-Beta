package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ra0 extends g.p {
    public final xa0 f26646c;

    public ra0(xa0 xa0Var) {
        this.f26646c = xa0Var;
    }

    @Override
    public final int i(int i10) {
        xa0 xa0Var = this.f26646c;
        fg.l1 l1Var = xa0Var.f28992f;
        if (i10 != 0) {
            int i11 = i10 - 1;
            Object J = l1Var.J(i11);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (l1Var.I() != null || l1Var.U != null) {
                i10 = i11;
            }
            qa0 qa0Var = xa0Var.d;
            qa0Var.B1();
            return qa0Var.R.get(i10);
        }
        return 100;
    }
}
