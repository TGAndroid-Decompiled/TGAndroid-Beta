package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class in0 implements Runnable {
    public final int f35141a;
    public final jo0 f35142b;

    public in0(jo0 jo0Var, int i10) {
        this.f35141a = i10;
        this.f35142b = jo0Var;
    }

    @Override
    public final void run() {
        switch (this.f35141a) {
            case 0:
                jo0 jo0Var = this.f35142b;
                jo0Var.f35399f[0].requestFocus();
                AndroidUtilities.showKeyboard(jo0Var.f35399f[0]);
                return;
            case 1:
                this.f35142b.t0();
                return;
            case 2:
                jo0 jo0Var2 = this.f35142b;
                jo0Var2.getMessagesController().newMessageCallback = null;
                if (jo0Var2.f35396c1 == 3 && !jo0Var2.isFinishing()) {
                    jo0Var2.f35396c1 = 4;
                    io0 io0Var = jo0Var2.W0;
                    if (io0Var != null) {
                        io0Var.a(4);
                    }
                    jo0Var2.finishFragment();
                    return;
                } else if (jo0Var2.f35396c1 == 1 && !jo0Var2.isFinishing()) {
                    jo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                jo0 jo0Var3 = this.f35142b;
                if (jo0Var3.f35389a0 != null) {
                    jo0Var3.w0();
                    jo0Var3.f35389a0 = null;
                    return;
                }
                return;
        }
    }
}
