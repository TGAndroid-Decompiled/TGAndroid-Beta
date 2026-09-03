package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class gp0 implements Runnable {
    public final int f27229a;
    public final lq0 f27230b;

    public gp0(lq0 lq0Var, int i10) {
        this.f27229a = i10;
        this.f27230b = lq0Var;
    }

    @Override
    public final void run() {
        switch (this.f27229a) {
            case 0:
                lq0 lq0Var = this.f27230b;
                lq0Var.f28856x0 = true;
                d20 d20Var = lq0Var.f28852v0;
                d20Var.f26132r.setText("");
                AndroidUtilities.showKeyboard(d20Var.f26132r);
                return;
            default:
                jc jcVar = new jc(12);
                lq0 lq0Var2 = this.f27230b;
                if (lq0Var2.isKeyboardVisible()) {
                    d20 d20Var2 = lq0Var2.f28852v0;
                    if (d20Var2 != null) {
                        AndroidUtilities.hideKeyboard(d20Var2.f26132r);
                    }
                    AndroidUtilities.runOnUIThread(jcVar, 300L);
                    return;
                }
                jcVar.run();
                return;
        }
    }
}
