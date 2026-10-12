package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class nq0 implements Runnable {
    public final int f28927a;
    public final sr0 f28928b;

    public nq0(sr0 sr0Var, int i10) {
        this.f28927a = i10;
        this.f28928b = sr0Var;
    }

    @Override
    public final void run() {
        switch (this.f28927a) {
            case 0:
                sr0 sr0Var = this.f28928b;
                sr0Var.A0 = true;
                v20 v20Var = sr0Var.f30665y0;
                v20Var.f31362r.setText("");
                AndroidUtilities.showKeyboard(v20Var.f31362r);
                return;
            default:
                xh xhVar = new xh(9);
                sr0 sr0Var2 = this.f28928b;
                if (sr0Var2.isKeyboardVisible()) {
                    v20 v20Var2 = sr0Var2.f30665y0;
                    if (v20Var2 != null) {
                        AndroidUtilities.hideKeyboard(v20Var2.f31362r);
                    }
                    AndroidUtilities.runOnUIThread(xhVar, 300L);
                    return;
                }
                xhVar.run();
                return;
        }
    }
}
