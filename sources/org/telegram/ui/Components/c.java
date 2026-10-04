package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f25087a;
    public final e0 f25088b;

    public c(e0 e0Var, int i10) {
        this.f25087a = i10;
        this.f25088b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f25087a) {
            case 0:
                e0 e0Var = this.f25088b;
                if (!e0Var.K0) {
                    e0Var.D0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                e0 e0Var2 = this.f25088b;
                if (e0Var2.K0) {
                    e0Var2.C0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f25088b.A0.f22307b);
                return;
            case 3:
                e0 e0Var3 = this.f25088b;
                e0Var3.l0(0, 0, false);
                e0Var3.dismiss();
                return;
            default:
                e0.O(this.f25088b);
                return;
        }
    }
}
