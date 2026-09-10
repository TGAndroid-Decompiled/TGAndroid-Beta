package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d implements Runnable {
    public final int f22258a;
    public final g0 f22259b;

    public d(g0 g0Var, int i10) {
        this.f22258a = i10;
        this.f22259b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f22258a) {
            case 0:
                g0 g0Var = this.f22259b;
                if (!g0Var.K0) {
                    g0Var.D0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                g0 g0Var2 = this.f22259b;
                if (g0Var2.K0) {
                    g0Var2.C0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f22259b.A0.f19293b);
                return;
            case 3:
                g0 g0Var3 = this.f22259b;
                g0Var3.l0(0, 0, false);
                g0Var3.dismiss();
                return;
            default:
                g0.Q(this.f22259b);
                return;
        }
    }
}
