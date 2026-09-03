package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f21 implements Runnable {
    public final int f26755a;
    public final w21 f26756b;

    public f21(w21 w21Var, int i10) {
        this.f26755a = i10;
        this.f26756b = w21Var;
    }

    @Override
    public final void run() {
        switch (this.f26755a) {
            case 0:
                w21 w21Var = this.f26756b;
                m21 m21Var = w21Var.D;
                m21Var.v1(true);
                k21 k21Var = w21Var.f32627s;
                k21Var.v1(true);
                w21Var.G.a(true, true);
                AndroidUtilities.updateVisibleRows(k21Var);
                AndroidUtilities.updateVisibleRows(m21Var);
                return;
            default:
                w21 w21Var2 = this.f26756b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    return;
                }
                return;
        }
    }
}
