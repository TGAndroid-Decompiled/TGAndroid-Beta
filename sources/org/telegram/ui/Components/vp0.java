package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vp0 implements Runnable {
    public final int f32339a;
    public final zq0 f32340b;

    public vp0(zq0 zq0Var, int i10) {
        this.f32339a = i10;
        this.f32340b = zq0Var;
    }

    @Override
    public final void run() {
        switch (this.f32339a) {
            case 0:
                zq0 zq0Var = this.f32340b;
                zq0Var.A0 = true;
                f20 f20Var = zq0Var.f33635y0;
                f20Var.f26252r.setText("");
                AndroidUtilities.showKeyboard(f20Var.f26252r);
                return;
            default:
                uh uhVar = new uh(9);
                zq0 zq0Var2 = this.f32340b;
                if (zq0Var2.isKeyboardVisible()) {
                    f20 f20Var2 = zq0Var2.f33635y0;
                    if (f20Var2 != null) {
                        AndroidUtilities.hideKeyboard(f20Var2.f26252r);
                    }
                    AndroidUtilities.runOnUIThread(uhVar, 300L);
                    return;
                }
                uhVar.run();
                return;
        }
    }
}
