package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yp0 implements Runnable {
    public final int f32728a;
    public final er0 f32729b;

    public yp0(er0 er0Var, int i10) {
        this.f32728a = i10;
        this.f32729b = er0Var;
    }

    @Override
    public final void run() {
        switch (this.f32728a) {
            case 0:
                er0 er0Var = this.f32729b;
                er0Var.B0 = true;
                k20 k20Var = er0Var.f26009z0;
                k20Var.f27686r.setText("");
                AndroidUtilities.showKeyboard(k20Var.f27686r);
                return;
            default:
                rc rcVar = new rc(14);
                er0 er0Var2 = this.f32729b;
                if (er0Var2.isKeyboardVisible()) {
                    k20 k20Var2 = er0Var2.f26009z0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.f27686r);
                    }
                    AndroidUtilities.runOnUIThread(rcVar, 300L);
                    return;
                }
                rcVar.run();
                return;
        }
    }
}
