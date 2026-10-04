package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pn0 implements Runnable {
    public final int f39518a;
    public final so0 f39519b;

    public pn0(so0 so0Var, int i10) {
        this.f39518a = i10;
        this.f39519b = so0Var;
    }

    @Override
    public final void run() {
        switch (this.f39518a) {
            case 0:
                so0 so0Var = this.f39519b;
                so0Var.f40553f[0].requestFocus();
                AndroidUtilities.showKeyboard(so0Var.f40553f[0]);
                return;
            case 1:
                this.f39519b.t0();
                return;
            case 2:
                so0 so0Var2 = this.f39519b;
                so0Var2.getMessagesController().newMessageCallback = null;
                if (so0Var2.f40555f1 == 3 && !so0Var2.isFinishing()) {
                    so0Var2.f40555f1 = 4;
                    ro0 ro0Var = so0Var2.Z0;
                    if (ro0Var != null) {
                        ro0Var.a(4);
                    }
                    so0Var2.finishFragment();
                    return;
                } else if (so0Var2.f40555f1 == 1 && !so0Var2.isFinishing()) {
                    so0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                so0 so0Var3 = this.f39519b;
                if (so0Var3.f40548d0 != null) {
                    so0Var3.w0();
                    so0Var3.f40548d0 = null;
                    return;
                }
                return;
        }
    }
}
