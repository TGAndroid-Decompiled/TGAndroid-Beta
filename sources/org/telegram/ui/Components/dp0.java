package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dp0 implements Runnable {
    public final int f23376a;
    public final iq0 f23377b;

    public dp0(iq0 iq0Var, int i10) {
        this.f23376a = i10;
        this.f23377b = iq0Var;
    }

    @Override
    public final void run() {
        switch (this.f23376a) {
            case 0:
                iq0 iq0Var = this.f23377b;
                iq0Var.A0 = true;
                b20 b20Var = iq0Var.f25019y0;
                b20Var.f22546r.setText("");
                AndroidUtilities.showKeyboard(b20Var.f22546r);
                return;
            default:
                sh shVar = new sh(7);
                iq0 iq0Var2 = this.f23377b;
                if (iq0Var2.isKeyboardVisible()) {
                    b20 b20Var2 = iq0Var2.f25019y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.f22546r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    return;
                }
                shVar.run();
                return;
        }
    }
}
