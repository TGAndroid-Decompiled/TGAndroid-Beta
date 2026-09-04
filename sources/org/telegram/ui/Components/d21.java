package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d21 implements Runnable {
    public final int f25183a;
    public final w21 f25184b;

    public d21(w21 w21Var, int i10) {
        this.f25183a = i10;
        this.f25184b = w21Var;
    }

    @Override
    public final void run() {
        switch (this.f25183a) {
            case 0:
                w21 w21Var = this.f25184b;
                m21 m21Var = w21Var.G;
                m21Var.v1(true);
                k21 k21Var = w21Var.f32103s;
                k21Var.v1(true);
                w21Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(k21Var);
                AndroidUtilities.updateVisibleRows(m21Var);
                return;
            default:
                w21 w21Var2 = this.f25184b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    return;
                }
                return;
        }
    }
}
