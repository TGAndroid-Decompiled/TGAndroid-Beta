package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class rp0 implements Runnable {
    public final int f28028a;
    public final wq0 f28029b;

    public rp0(wq0 wq0Var, int i10) {
        this.f28028a = i10;
        this.f28029b = wq0Var;
    }

    @Override
    public final void run() {
        switch (this.f28028a) {
            case 0:
                wq0 wq0Var = this.f28029b;
                wq0Var.A0 = true;
                b20 b20Var = wq0Var.f30129y0;
                b20Var.f22811r.setText("");
                AndroidUtilities.showKeyboard(b20Var.f22811r);
                return;
            default:
                sh shVar = new sh(9);
                wq0 wq0Var2 = this.f28029b;
                if (wq0Var2.isKeyboardVisible()) {
                    b20 b20Var2 = wq0Var2.f30129y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.f22811r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    return;
                }
                shVar.run();
                return;
        }
    }
}
