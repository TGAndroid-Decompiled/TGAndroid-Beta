package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class pp0 implements Runnable {
    public final int f27402a;
    public final uq0 f27403b;

    public pp0(uq0 uq0Var, int i10) {
        this.f27402a = i10;
        this.f27403b = uq0Var;
    }

    @Override
    public final void run() {
        switch (this.f27402a) {
            case 0:
                uq0 uq0Var = this.f27403b;
                uq0Var.A0 = true;
                c20 c20Var = uq0Var.f28893y0;
                c20Var.f23131r.setText("");
                AndroidUtilities.showKeyboard(c20Var.f23131r);
                return;
            default:
                th thVar = new th(9);
                uq0 uq0Var2 = this.f27403b;
                if (uq0Var2.isKeyboardVisible()) {
                    c20 c20Var2 = uq0Var2.f28893y0;
                    if (c20Var2 != null) {
                        AndroidUtilities.hideKeyboard(c20Var2.f23131r);
                    }
                    AndroidUtilities.runOnUIThread(thVar, 300L);
                    return;
                }
                thVar.run();
                return;
        }
    }
}
