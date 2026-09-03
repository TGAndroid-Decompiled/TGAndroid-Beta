package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class fp0 implements Runnable {
    public final int f24948a;
    public final lq0 f24949b;

    public fp0(lq0 lq0Var, int i10) {
        this.f24948a = i10;
        this.f24949b = lq0Var;
    }

    @Override
    public final void run() {
        switch (this.f24948a) {
            case 0:
                lq0 lq0Var = this.f24949b;
                lq0Var.f26862x0 = true;
                d20 d20Var = lq0Var.f26858v0;
                d20Var.f24117r.setText("");
                AndroidUtilities.showKeyboard(d20Var.f24117r);
                return;
            default:
                mc mcVar = new mc(10);
                lq0 lq0Var2 = this.f24949b;
                if (lq0Var2.isKeyboardVisible()) {
                    d20 d20Var2 = lq0Var2.f26858v0;
                    if (d20Var2 != null) {
                        AndroidUtilities.hideKeyboard(d20Var2.f24117r);
                    }
                    AndroidUtilities.runOnUIThread(mcVar, 300L);
                    return;
                }
                mcVar.run();
                return;
        }
    }
}
