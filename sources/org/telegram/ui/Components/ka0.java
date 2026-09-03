package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ka0 extends f2.v {
    public final qa0 f26246c;

    public ka0(qa0 qa0Var) {
        this.f26246c = qa0Var;
    }

    @Override
    public final int i(int i10) {
        qa0 qa0Var = this.f26246c;
        tf.u0 u0Var = qa0Var.f28129f;
        if (i10 != 0) {
            int i11 = i10 - 1;
            Object J = u0Var.J(i11);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (u0Var.I() != null || u0Var.R != null) {
                i10 = i11;
            }
            ja0 ja0Var = qa0Var.d;
            ja0Var.B1();
            return ja0Var.R.get(i10);
        }
        return 100;
    }
}
