package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class cp0 implements Runnable {
    public final int f23117a;
    public final hq0 f23118b;

    public cp0(hq0 hq0Var, int i10) {
        this.f23117a = i10;
        this.f23118b = hq0Var;
    }

    @Override
    public final void run() {
        switch (this.f23117a) {
            case 0:
                hq0 hq0Var = this.f23118b;
                hq0Var.A0 = true;
                b20 b20Var = hq0Var.f24786y0;
                b20Var.f22569r.setText("");
                AndroidUtilities.showKeyboard(b20Var.f22569r);
                return;
            default:
                sh shVar = new sh(7);
                hq0 hq0Var2 = this.f23118b;
                if (hq0Var2.isKeyboardVisible()) {
                    b20 b20Var2 = hq0Var2.f24786y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.f22569r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    return;
                }
                shVar.run();
                return;
        }
    }
}
