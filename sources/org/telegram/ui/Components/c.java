package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f23772a;
    public final f0 f23773b;

    public c(f0 f0Var, int i10) {
        this.f23772a = i10;
        this.f23773b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f23772a) {
            case 0:
                f0 f0Var = this.f23773b;
                if (!f0Var.H0) {
                    f0Var.A0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                f0 f0Var2 = this.f23773b;
                if (f0Var2.H0) {
                    f0Var2.f24734z0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f23773b.f24732x0.f21199b);
                return;
            case 3:
                f0 f0Var3 = this.f23773b;
                f0Var3.l0(0, 0, false);
                f0Var3.dismiss();
                return;
            default:
                f0.Q(this.f23773b);
                return;
        }
    }
}
