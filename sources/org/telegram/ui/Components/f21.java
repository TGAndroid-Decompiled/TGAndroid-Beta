package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f21 implements Runnable {
    public final int f24776a;
    public final w21 f24777b;

    public f21(w21 w21Var, int i10) {
        this.f24776a = i10;
        this.f24777b = w21Var;
    }

    @Override
    public final void run() {
        switch (this.f24776a) {
            case 0:
                w21 w21Var = this.f24777b;
                m21 m21Var = w21Var.D;
                m21Var.v1(true);
                k21 k21Var = w21Var.f30130s;
                k21Var.v1(true);
                w21Var.G.a(true, true);
                AndroidUtilities.updateVisibleRows(k21Var);
                AndroidUtilities.updateVisibleRows(m21Var);
                return;
            default:
                w21 w21Var2 = this.f24777b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    return;
                }
                return;
        }
    }
}
