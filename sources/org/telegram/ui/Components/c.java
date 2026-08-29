package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f27249a;
    public final g0 f27250b;

    public c(g0 g0Var, int i10) {
        this.f27249a = i10;
        this.f27250b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f27249a) {
            case 0:
                g0 g0Var = this.f27250b;
                if (!g0Var.G0) {
                    g0Var.f28690z0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                g0 g0Var2 = this.f27250b;
                if (g0Var2.G0) {
                    g0Var2.f28689y0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f27250b.f28687w0.f24387b);
                return;
            case 3:
                g0 g0Var3 = this.f27250b;
                g0Var3.l0(0, 0, false);
                g0Var3.dismiss();
                return;
            default:
                g0.Q(this.f27250b);
                return;
        }
    }
}
