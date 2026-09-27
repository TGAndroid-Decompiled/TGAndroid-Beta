package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class on0 implements Runnable {
    public final int f36230a;
    public final ro0 f36231b;

    public on0(ro0 ro0Var, int i10) {
        this.f36230a = i10;
        this.f36231b = ro0Var;
    }

    @Override
    public final void run() {
        switch (this.f36230a) {
            case 0:
                ro0 ro0Var = this.f36231b;
                ro0Var.f37180f[0].requestFocus();
                AndroidUtilities.showKeyboard(ro0Var.f37180f[0]);
                return;
            case 1:
                this.f36231b.t0();
                return;
            case 2:
                ro0 ro0Var2 = this.f36231b;
                ro0Var2.getMessagesController().newMessageCallback = null;
                if (ro0Var2.f37182f1 == 3 && !ro0Var2.isFinishing()) {
                    ro0Var2.f37182f1 = 4;
                    qo0 qo0Var = ro0Var2.Z0;
                    if (qo0Var != null) {
                        qo0Var.a(4);
                    }
                    ro0Var2.finishFragment();
                    return;
                } else if (ro0Var2.f37182f1 == 1 && !ro0Var2.isFinishing()) {
                    ro0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                ro0 ro0Var3 = this.f36231b;
                if (ro0Var3.f37176d0 != null) {
                    ro0Var3.w0();
                    ro0Var3.f37176d0 = null;
                    return;
                }
                return;
        }
    }
}
