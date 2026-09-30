package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kn0 implements Runnable {
    public final int f35199a;
    public final no0 f35200b;

    public kn0(no0 no0Var, int i10) {
        this.f35199a = i10;
        this.f35200b = no0Var;
    }

    @Override
    public final void run() {
        switch (this.f35199a) {
            case 0:
                no0 no0Var = this.f35200b;
                no0Var.f36062f[0].requestFocus();
                AndroidUtilities.showKeyboard(no0Var.f36062f[0]);
                return;
            case 1:
                this.f35200b.t0();
                return;
            case 2:
                no0 no0Var2 = this.f35200b;
                no0Var2.getMessagesController().newMessageCallback = null;
                if (no0Var2.f36064f1 == 3 && !no0Var2.isFinishing()) {
                    no0Var2.f36064f1 = 4;
                    mo0 mo0Var = no0Var2.Z0;
                    if (mo0Var != null) {
                        mo0Var.a(4);
                    }
                    no0Var2.finishFragment();
                    return;
                } else if (no0Var2.f36064f1 == 1 && !no0Var2.isFinishing()) {
                    no0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                no0 no0Var3 = this.f35200b;
                if (no0Var3.f36058d0 != null) {
                    no0Var3.w0();
                    no0Var3.f36058d0 = null;
                    return;
                }
                return;
        }
    }
}
