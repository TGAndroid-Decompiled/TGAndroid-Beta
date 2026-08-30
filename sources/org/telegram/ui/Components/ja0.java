package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ja0 extends f2.v {
    public final pa0 f25948c;

    public ja0(pa0 pa0Var) {
        this.f25948c = pa0Var;
    }

    @Override
    public final int i(int i10) {
        pa0 pa0Var = this.f25948c;
        tf.u0 u0Var = pa0Var.f27803f;
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
            ia0 ia0Var = pa0Var.d;
            ia0Var.B1();
            return ia0Var.R.get(i10);
        }
        return 100;
    }
}
