package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yp0 implements Runnable {
    public final int f32743a;
    public final dr0 f32744b;

    public yp0(dr0 dr0Var, int i10) {
        this.f32743a = i10;
        this.f32744b = dr0Var;
    }

    @Override
    public final void run() {
        switch (this.f32743a) {
            case 0:
                dr0 dr0Var = this.f32744b;
                dr0Var.A0 = true;
                k20 k20Var = dr0Var.f25691y0;
                k20Var.f27719r.setText("");
                AndroidUtilities.showKeyboard(k20Var.f27719r);
                return;
            default:
                rc rcVar = new rc(14);
                dr0 dr0Var2 = this.f32744b;
                if (dr0Var2.isKeyboardVisible()) {
                    k20 k20Var2 = dr0Var2.f25691y0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.f27719r);
                    }
                    AndroidUtilities.runOnUIThread(rcVar, 300L);
                    return;
                }
                rcVar.run();
                return;
        }
    }
}
