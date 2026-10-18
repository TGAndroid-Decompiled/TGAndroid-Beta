package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cn0 implements Runnable {
    public final int f35976a;
    public final go0 f35977b;

    public cn0(go0 go0Var, int i10) {
        this.f35976a = i10;
        this.f35977b = go0Var;
    }

    @Override
    public final void run() {
        switch (this.f35976a) {
            case 0:
                go0 go0Var = this.f35977b;
                go0Var.f37266f[0].requestFocus();
                AndroidUtilities.showKeyboard(go0Var.f37266f[0]);
                return;
            case 1:
                this.f35977b.t0();
                return;
            case 2:
                go0 go0Var2 = this.f35977b;
                go0Var2.getMessagesController().newMessageCallback = null;
                if (go0Var2.f37268f1 == 3 && !go0Var2.isFinishing()) {
                    go0Var2.f37268f1 = 4;
                    fo0 fo0Var = go0Var2.Z0;
                    if (fo0Var != null) {
                        fo0Var.c(4);
                    }
                    go0Var2.finishFragment();
                    return;
                } else if (go0Var2.f37268f1 == 1 && !go0Var2.isFinishing()) {
                    go0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                go0 go0Var3 = this.f35977b;
                if (go0Var3.f37262d0 != null) {
                    go0Var3.w0();
                    go0Var3.f37262d0 = null;
                    return;
                }
                return;
        }
    }
}
