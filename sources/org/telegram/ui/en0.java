package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class en0 implements Runnable {
    public final int f36958a;
    public final ho0 f36959b;

    public en0(ho0 ho0Var, int i10) {
        this.f36958a = i10;
        this.f36959b = ho0Var;
    }

    @Override
    public final void run() {
        switch (this.f36958a) {
            case 0:
                ho0 ho0Var = this.f36959b;
                ho0Var.f37927f[0].requestFocus();
                AndroidUtilities.showKeyboard(ho0Var.f37927f[0]);
                return;
            case 1:
                this.f36959b.t0();
                return;
            case 2:
                ho0 ho0Var2 = this.f36959b;
                ho0Var2.getMessagesController().newMessageCallback = null;
                if (ho0Var2.f37929f1 == 3 && !ho0Var2.isFinishing()) {
                    ho0Var2.f37929f1 = 4;
                    go0 go0Var = ho0Var2.Z0;
                    if (go0Var != null) {
                        go0Var.a(4);
                    }
                    ho0Var2.finishFragment();
                    return;
                } else if (ho0Var2.f37929f1 == 1 && !ho0Var2.isFinishing()) {
                    ho0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                ho0 ho0Var3 = this.f36959b;
                if (ho0Var3.f37923d0 != null) {
                    ho0Var3.w0();
                    ho0Var3.f37923d0 = null;
                    return;
                }
                return;
        }
    }
}
