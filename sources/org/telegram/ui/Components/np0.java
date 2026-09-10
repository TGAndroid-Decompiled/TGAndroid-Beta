package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class np0 implements Runnable {
    public final int f25565a;
    public final sq0 f25566b;

    public np0(sq0 sq0Var, int i10) {
        this.f25565a = i10;
        this.f25566b = sq0Var;
    }

    @Override
    public final void run() {
        switch (this.f25565a) {
            case 0:
                sq0 sq0Var = this.f25566b;
                sq0Var.A0 = true;
                k20 k20Var = sq0Var.f27198y0;
                k20Var.f24572r.setText("");
                AndroidUtilities.showKeyboard(k20Var.f24572r);
                return;
            default:
                c30 c30Var = new c30(2);
                sq0 sq0Var2 = this.f25566b;
                if (sq0Var2.isKeyboardVisible()) {
                    k20 k20Var2 = sq0Var2.f27198y0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.f24572r);
                    }
                    AndroidUtilities.runOnUIThread(c30Var, 300L);
                    return;
                }
                c30Var.run();
                return;
        }
    }
}
