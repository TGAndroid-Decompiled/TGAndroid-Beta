package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d21 implements Runnable {
    public final int f23210a;
    public final w21 f23211b;

    public d21(w21 w21Var, int i10) {
        this.f23210a = i10;
        this.f23211b = w21Var;
    }

    @Override
    public final void run() {
        switch (this.f23210a) {
            case 0:
                w21 w21Var = this.f23211b;
                m21 m21Var = w21Var.G;
                m21Var.w1(true);
                k21 k21Var = w21Var.f29488s;
                k21Var.w1(true);
                w21Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(k21Var);
                AndroidUtilities.updateVisibleRows(m21Var);
                return;
            default:
                w21 w21Var2 = this.f23211b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    return;
                }
                return;
        }
    }
}
