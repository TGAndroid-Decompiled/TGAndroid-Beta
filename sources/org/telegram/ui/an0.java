package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class an0 implements Runnable {
    public final int f35393a;
    public final eo0 f35394b;

    public an0(eo0 eo0Var, int i10) {
        this.f35393a = i10;
        this.f35394b = eo0Var;
    }

    @Override
    public final void run() {
        switch (this.f35393a) {
            case 0:
                eo0 eo0Var = this.f35394b;
                eo0Var.f36711f[0].requestFocus();
                AndroidUtilities.showKeyboard(eo0Var.f36711f[0]);
                return;
            case 1:
                this.f35394b.t0();
                return;
            case 2:
                eo0 eo0Var2 = this.f35394b;
                eo0Var2.getMessagesController().newMessageCallback = null;
                if (eo0Var2.f36713f1 == 3 && !eo0Var2.isFinishing()) {
                    eo0Var2.f36713f1 = 4;
                    do0 do0Var = eo0Var2.Z0;
                    if (do0Var != null) {
                        do0Var.c(4);
                    }
                    eo0Var2.finishFragment();
                    return;
                } else if (eo0Var2.f36713f1 == 1 && !eo0Var2.isFinishing()) {
                    eo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                eo0 eo0Var3 = this.f35394b;
                if (eo0Var3.f36707d0 != null) {
                    eo0Var3.w0();
                    eo0Var3.f36707d0 = null;
                    return;
                }
                return;
        }
    }
}
