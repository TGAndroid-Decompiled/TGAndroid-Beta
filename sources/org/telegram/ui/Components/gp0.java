package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class gp0 implements Runnable {
    public final int f25230a;
    public final lq0 f25231b;

    public gp0(lq0 lq0Var, int i10) {
        this.f25230a = i10;
        this.f25231b = lq0Var;
    }

    @Override
    public final void run() {
        switch (this.f25230a) {
            case 0:
                lq0 lq0Var = this.f25231b;
                lq0Var.f26872x0 = true;
                c20 c20Var = lq0Var.f26868v0;
                c20Var.f23815r.setText("");
                AndroidUtilities.showKeyboard(c20Var.f23815r);
                return;
            default:
                mc mcVar = new mc(10);
                lq0 lq0Var2 = this.f25231b;
                if (lq0Var2.isKeyboardVisible()) {
                    c20 c20Var2 = lq0Var2.f26868v0;
                    if (c20Var2 != null) {
                        AndroidUtilities.hideKeyboard(c20Var2.f23815r);
                    }
                    AndroidUtilities.runOnUIThread(mcVar, 300L);
                    return;
                }
                mcVar.run();
                return;
        }
    }
}
