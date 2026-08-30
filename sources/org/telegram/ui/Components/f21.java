package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f21 implements Runnable {
    public final int f24759a;
    public final w21 f24760b;

    public f21(w21 w21Var, int i10) {
        this.f24759a = i10;
        this.f24760b = w21Var;
    }

    @Override
    public final void run() {
        switch (this.f24759a) {
            case 0:
                w21 w21Var = this.f24760b;
                m21 m21Var = w21Var.D;
                m21Var.w1(true);
                k21 k21Var = w21Var.f30180s;
                k21Var.w1(true);
                w21Var.G.a(true, true);
                AndroidUtilities.updateVisibleRows(k21Var);
                AndroidUtilities.updateVisibleRows(m21Var);
                return;
            default:
                w21 w21Var2 = this.f24760b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    return;
                }
                return;
        }
    }
}
