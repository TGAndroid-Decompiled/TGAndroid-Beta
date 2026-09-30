package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class sp0 implements Runnable {
    public final int f28319a;
    public final xq0 f28320b;

    public sp0(xq0 xq0Var, int i10) {
        this.f28319a = i10;
        this.f28320b = xq0Var;
    }

    @Override
    public final void run() {
        switch (this.f28319a) {
            case 0:
                xq0 xq0Var = this.f28320b;
                xq0Var.A0 = true;
                f20 f20Var = xq0Var.f30486y0;
                f20Var.f24137r.setText("");
                AndroidUtilities.showKeyboard(f20Var.f24137r);
                return;
            default:
                uh uhVar = new uh(9);
                xq0 xq0Var2 = this.f28320b;
                if (xq0Var2.isKeyboardVisible()) {
                    f20 f20Var2 = xq0Var2.f30486y0;
                    if (f20Var2 != null) {
                        AndroidUtilities.hideKeyboard(f20Var2.f24137r);
                    }
                    AndroidUtilities.runOnUIThread(uhVar, 300L);
                    return;
                }
                uhVar.run();
                return;
        }
    }
}
