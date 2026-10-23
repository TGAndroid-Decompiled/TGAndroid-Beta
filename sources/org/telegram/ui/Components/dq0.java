package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dq0 implements Runnable {
    public final int f25713a;
    public final ir0 f25714b;

    public dq0(ir0 ir0Var, int i10) {
        this.f25713a = i10;
        this.f25714b = ir0Var;
    }

    @Override
    public final void run() {
        switch (this.f25713a) {
            case 0:
                ir0 ir0Var = this.f25714b;
                ir0Var.B0 = true;
                k20 k20Var = ir0Var.f27442z0;
                k20Var.f27836r.setText("");
                AndroidUtilities.showKeyboard(k20Var.f27836r);
                return;
            default:
                rc rcVar = new rc(14);
                ir0 ir0Var2 = this.f25714b;
                if (ir0Var2.isKeyboardVisible()) {
                    k20 k20Var2 = ir0Var2.f27442z0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.f27836r);
                    }
                    AndroidUtilities.runOnUIThread(rcVar, 300L);
                    return;
                }
                rcVar.run();
                return;
        }
    }
}
