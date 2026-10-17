package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cn0 implements Runnable {
    public final int f35963a;
    public final fo0 f35964b;

    public cn0(fo0 fo0Var, int i10) {
        this.f35963a = i10;
        this.f35964b = fo0Var;
    }

    @Override
    public final void run() {
        switch (this.f35963a) {
            case 0:
                fo0 fo0Var = this.f35964b;
                fo0Var.f36983f[0].requestFocus();
                AndroidUtilities.showKeyboard(fo0Var.f36983f[0]);
                return;
            case 1:
                this.f35964b.t0();
                return;
            case 2:
                fo0 fo0Var2 = this.f35964b;
                fo0Var2.getMessagesController().newMessageCallback = null;
                if (fo0Var2.f36985f1 == 3 && !fo0Var2.isFinishing()) {
                    fo0Var2.f36985f1 = 4;
                    eo0 eo0Var = fo0Var2.Z0;
                    if (eo0Var != null) {
                        eo0Var.c(4);
                    }
                    fo0Var2.finishFragment();
                    return;
                } else if (fo0Var2.f36985f1 == 1 && !fo0Var2.isFinishing()) {
                    fo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                fo0 fo0Var3 = this.f35964b;
                if (fo0Var3.f36979d0 != null) {
                    fo0Var3.w0();
                    fo0Var3.f36979d0 = null;
                    return;
                }
                return;
        }
    }
}
