package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nn0 implements Runnable {
    public final int f41957a;
    public final po0 f41958b;

    public nn0(po0 po0Var, int i10) {
        this.f41957a = i10;
        this.f41958b = po0Var;
    }

    @Override
    public final void run() {
        switch (this.f41957a) {
            case 0:
                po0 po0Var = this.f41958b;
                po0Var.f42599f[0].requestFocus();
                AndroidUtilities.showKeyboard(po0Var.f42599f[0]);
                return;
            case 1:
                this.f41958b.u0();
                return;
            case 2:
                po0 po0Var2 = this.f41958b;
                po0Var2.getMessagesController().newMessageCallback = null;
                if (po0Var2.f42601f1 == 3 && !po0Var2.isFinishing()) {
                    po0Var2.f42601f1 = 4;
                    oo0 oo0Var = po0Var2.Z0;
                    if (oo0Var != null) {
                        oo0Var.a(4);
                    }
                    po0Var2.finishFragment();
                    return;
                } else if (po0Var2.f42601f1 == 1 && !po0Var2.isFinishing()) {
                    po0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                po0 po0Var3 = this.f41958b;
                if (po0Var3.f42595d0 != null) {
                    po0Var3.x0();
                    po0Var3.f42595d0 = null;
                    return;
                }
                return;
        }
    }
}
