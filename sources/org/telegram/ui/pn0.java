package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pn0 implements Runnable {
    public final int f39524a;
    public final so0 f39525b;

    public pn0(so0 so0Var, int i10) {
        this.f39524a = i10;
        this.f39525b = so0Var;
    }

    @Override
    public final void run() {
        switch (this.f39524a) {
            case 0:
                so0 so0Var = this.f39525b;
                so0Var.f40560f[0].requestFocus();
                AndroidUtilities.showKeyboard(so0Var.f40560f[0]);
                return;
            case 1:
                this.f39525b.t0();
                return;
            case 2:
                so0 so0Var2 = this.f39525b;
                so0Var2.getMessagesController().newMessageCallback = null;
                if (so0Var2.f40562f1 == 3 && !so0Var2.isFinishing()) {
                    so0Var2.f40562f1 = 4;
                    ro0 ro0Var = so0Var2.Z0;
                    if (ro0Var != null) {
                        ro0Var.a(4);
                    }
                    so0Var2.finishFragment();
                    return;
                } else if (so0Var2.f40562f1 == 1 && !so0Var2.isFinishing()) {
                    so0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                so0 so0Var3 = this.f39525b;
                if (so0Var3.f40555d0 != null) {
                    so0Var3.w0();
                    so0Var3.f40555d0 = null;
                    return;
                }
                return;
        }
    }
}
