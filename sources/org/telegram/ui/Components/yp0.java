package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yp0 implements Runnable {
    public final int f32730a;
    public final er0 f32731b;

    public yp0(er0 er0Var, int i10) {
        this.f32730a = i10;
        this.f32731b = er0Var;
    }

    @Override
    public final void run() {
        switch (this.f32730a) {
            case 0:
                er0 er0Var = this.f32731b;
                er0Var.B0 = true;
                k20 k20Var = er0Var.f26011z0;
                k20Var.f27688r.setText("");
                AndroidUtilities.showKeyboard(k20Var.f27688r);
                return;
            default:
                sc scVar = new sc(13);
                er0 er0Var2 = this.f32731b;
                if (er0Var2.isKeyboardVisible()) {
                    k20 k20Var2 = er0Var2.f26011z0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.f27688r);
                    }
                    AndroidUtilities.runOnUIThread(scVar, 300L);
                    return;
                }
                scVar.run();
                return;
        }
    }
}
