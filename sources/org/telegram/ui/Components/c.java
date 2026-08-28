package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f27307a;
    public final e0 f27308b;

    public c(e0 e0Var, int i9) {
        this.f27307a = i9;
        this.f27308b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f27307a) {
            case 0:
                e0 e0Var = this.f27308b;
                if (!e0Var.G0) {
                    e0Var.f27876z0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                e0 e0Var2 = this.f27308b;
                if (e0Var2.G0) {
                    e0Var2.f27875y0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f27308b.f27873w0.f24544b);
                return;
            case 3:
                e0 e0Var3 = this.f27308b;
                e0Var3.k0(0, 0, false);
                e0Var3.dismiss();
                return;
            default:
                e0.P(this.f27308b);
                return;
        }
    }
}
