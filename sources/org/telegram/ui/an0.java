package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class an0 implements Runnable {
    public final int f36574a;
    public final bo0 f36575b;

    public an0(bo0 bo0Var, int i10) {
        this.f36574a = i10;
        this.f36575b = bo0Var;
    }

    @Override
    public final void run() {
        switch (this.f36574a) {
            case 0:
                bo0 bo0Var = this.f36575b;
                bo0Var.f36849f[0].requestFocus();
                AndroidUtilities.showKeyboard(bo0Var.f36849f[0]);
                return;
            case 1:
                this.f36575b.t0();
                return;
            case 2:
                bo0 bo0Var2 = this.f36575b;
                bo0Var2.getMessagesController().newMessageCallback = null;
                if (bo0Var2.f36843b1 == 3 && !bo0Var2.isFinishing()) {
                    bo0Var2.f36843b1 = 4;
                    ao0 ao0Var = bo0Var2.V0;
                    if (ao0Var != null) {
                        ao0Var.a(4);
                    }
                    bo0Var2.finishFragment();
                    return;
                } else if (bo0Var2.f36843b1 == 1 && !bo0Var2.isFinishing()) {
                    bo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                bo0 bo0Var3 = this.f36575b;
                if (bo0Var3.Z != null) {
                    bo0Var3.w0();
                    bo0Var3.Z = null;
                    return;
                }
                return;
        }
    }
}
