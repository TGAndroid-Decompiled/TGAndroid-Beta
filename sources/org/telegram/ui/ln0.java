package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ln0 implements Runnable {
    public final int f35390a;
    public final oo0 f35391b;

    public ln0(oo0 oo0Var, int i10) {
        this.f35390a = i10;
        this.f35391b = oo0Var;
    }

    @Override
    public final void run() {
        switch (this.f35390a) {
            case 0:
                oo0 oo0Var = this.f35391b;
                oo0Var.f36291f[0].requestFocus();
                AndroidUtilities.showKeyboard(oo0Var.f36291f[0]);
                return;
            case 1:
                this.f35391b.t0();
                return;
            case 2:
                oo0 oo0Var2 = this.f35391b;
                oo0Var2.getMessagesController().newMessageCallback = null;
                if (oo0Var2.f36293f1 == 3 && !oo0Var2.isFinishing()) {
                    oo0Var2.f36293f1 = 4;
                    no0 no0Var = oo0Var2.Z0;
                    if (no0Var != null) {
                        no0Var.a(4);
                    }
                    oo0Var2.finishFragment();
                    return;
                } else if (oo0Var2.f36293f1 == 1 && !oo0Var2.isFinishing()) {
                    oo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                oo0 oo0Var3 = this.f35391b;
                if (oo0Var3.f36287d0 != null) {
                    oo0Var3.w0();
                    oo0Var3.f36287d0 = null;
                    return;
                }
                return;
        }
    }
}
