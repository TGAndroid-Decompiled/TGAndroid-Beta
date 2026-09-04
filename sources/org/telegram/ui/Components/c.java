package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f24830a;
    public final f0 f24831b;

    public c(f0 f0Var, int i10) {
        this.f24830a = i10;
        this.f24831b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f24830a) {
            case 0:
                f0 f0Var = this.f24831b;
                if (!f0Var.K0) {
                    f0Var.D0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                f0 f0Var2 = this.f24831b;
                if (f0Var2.K0) {
                    f0Var2.C0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f24831b.A0.f22074b);
                return;
            case 3:
                f0 f0Var3 = this.f24831b;
                f0Var3.l0(0, 0, false);
                f0Var3.dismiss();
                return;
            default:
                f0.Q(this.f24831b);
                return;
        }
    }
}
