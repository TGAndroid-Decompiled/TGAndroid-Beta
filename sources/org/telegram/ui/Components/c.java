package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f24831a;
    public final f0 f24832b;

    public c(f0 f0Var, int i10) {
        this.f24831a = i10;
        this.f24832b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f24831a) {
            case 0:
                f0 f0Var = this.f24832b;
                if (!f0Var.K0) {
                    f0Var.D0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                f0 f0Var2 = this.f24832b;
                if (f0Var2.K0) {
                    f0Var2.C0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f24832b.A0.f22075b);
                return;
            case 3:
                f0 f0Var3 = this.f24832b;
                f0Var3.l0(0, 0, false);
                f0Var3.dismiss();
                return;
            default:
                f0.Q(this.f24832b);
                return;
        }
    }
}
