package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class k31 implements Runnable {
    public final int f27878a;
    public final d41 f27879b;

    public k31(d41 d41Var, int i10) {
        this.f27878a = i10;
        this.f27879b = d41Var;
    }

    @Override
    public final void run() {
        switch (this.f27878a) {
            case 0:
                d41 d41Var = this.f27879b;
                t31 t31Var = d41Var.G;
                t31Var.x1(true);
                r31 r31Var = d41Var.f25558s;
                r31Var.x1(true);
                d41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(r31Var);
                AndroidUtilities.updateVisibleRows(t31Var);
                return;
            default:
                d41 d41Var2 = this.f27879b;
                if (d41Var2.k()) {
                    d41Var2.l();
                    return;
                }
                return;
        }
    }
}
