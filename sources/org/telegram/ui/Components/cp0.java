package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class cp0 implements Runnable {
    public final int f23118a;
    public final hq0 f23119b;

    public cp0(hq0 hq0Var, int i10) {
        this.f23118a = i10;
        this.f23119b = hq0Var;
    }

    @Override
    public final void run() {
        switch (this.f23118a) {
            case 0:
                hq0 hq0Var = this.f23119b;
                hq0Var.A0 = true;
                b20 b20Var = hq0Var.f24780y0;
                b20Var.f22573r.setText("");
                AndroidUtilities.showKeyboard(b20Var.f22573r);
                return;
            default:
                sh shVar = new sh(7);
                hq0 hq0Var2 = this.f23119b;
                if (hq0Var2.isKeyboardVisible()) {
                    b20 b20Var2 = hq0Var2.f24780y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.f22573r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    return;
                }
                shVar.run();
                return;
        }
    }
}
