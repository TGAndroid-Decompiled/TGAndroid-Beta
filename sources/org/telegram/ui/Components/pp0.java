package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class pp0 implements Runnable {
    public final int f27417a;
    public final uq0 f27418b;

    public pp0(uq0 uq0Var, int i10) {
        this.f27417a = i10;
        this.f27418b = uq0Var;
    }

    @Override
    public final void run() {
        switch (this.f27417a) {
            case 0:
                uq0 uq0Var = this.f27418b;
                uq0Var.A0 = true;
                b20 b20Var = uq0Var.f28836y0;
                b20Var.f22856r.setText("");
                AndroidUtilities.showKeyboard(b20Var.f22856r);
                return;
            default:
                sh shVar = new sh(9);
                uq0 uq0Var2 = this.f27418b;
                if (uq0Var2.isKeyboardVisible()) {
                    b20 b20Var2 = uq0Var2.f28836y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.f22856r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    return;
                }
                shVar.run();
                return;
        }
    }
}
