package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f25738a;
    public final f0 f25739b;

    public c(f0 f0Var, int i10) {
        this.f25738a = i10;
        this.f25739b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f25738a) {
            case 0:
                f0 f0Var = this.f25739b;
                if (!f0Var.H0) {
                    f0Var.A0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                f0 f0Var2 = this.f25739b;
                if (f0Var2.H0) {
                    f0Var2.f26712z0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f25739b.f26710x0.f22955b);
                return;
            case 3:
                f0 f0Var3 = this.f25739b;
                f0Var3.l0(0, 0, false);
                f0Var3.dismiss();
                return;
            default:
                f0.Q(this.f25739b);
                return;
        }
    }
}
