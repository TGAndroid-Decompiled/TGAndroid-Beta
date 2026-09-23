package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f22866a;
    public final e0 f22867b;

    public c(e0 e0Var, int i10) {
        this.f22866a = i10;
        this.f22867b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f22866a) {
            case 0:
                e0 e0Var = this.f22867b;
                if (!e0Var.K0) {
                    e0Var.D0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                e0 e0Var2 = this.f22867b;
                if (e0Var2.K0) {
                    e0Var2.C0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f22867b.A0.f20177b);
                return;
            case 3:
                e0 e0Var3 = this.f22867b;
                e0Var3.l0(0, 0, false);
                e0Var3.dismiss();
                return;
            default:
                e0.Q(this.f22867b);
                return;
        }
    }
}
