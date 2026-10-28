package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pn0 implements Runnable {
    public final int f42460a;
    public final ro0 f42461b;

    public pn0(ro0 ro0Var, int i10) {
        this.f42460a = i10;
        this.f42461b = ro0Var;
    }

    @Override
    public final void run() {
        switch (this.f42460a) {
            case 0:
                ro0 ro0Var = this.f42461b;
                ro0Var.f43110f[0].requestFocus();
                AndroidUtilities.showKeyboard(ro0Var.f43110f[0]);
                return;
            case 1:
                this.f42461b.u0();
                return;
            case 2:
                ro0 ro0Var2 = this.f42461b;
                ro0Var2.getMessagesController().newMessageCallback = null;
                if (ro0Var2.f43112f1 == 3 && !ro0Var2.isFinishing()) {
                    ro0Var2.f43112f1 = 4;
                    qo0 qo0Var = ro0Var2.Z0;
                    if (qo0Var != null) {
                        qo0Var.a(4);
                    }
                    ro0Var2.finishFragment();
                    return;
                } else if (ro0Var2.f43112f1 == 1 && !ro0Var2.isFinishing()) {
                    ro0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                ro0 ro0Var3 = this.f42461b;
                if (ro0Var3.f43106d0 != null) {
                    ro0Var3.x0();
                    ro0Var3.f43106d0 = null;
                    return;
                }
                return;
        }
    }
}
