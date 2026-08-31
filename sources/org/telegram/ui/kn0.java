package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kn0 implements Runnable {
    public final int f38446a;
    public final lo0 f38447b;

    public kn0(lo0 lo0Var, int i10) {
        this.f38446a = i10;
        this.f38447b = lo0Var;
    }

    @Override
    public final void run() {
        switch (this.f38446a) {
            case 0:
                lo0 lo0Var = this.f38447b;
                lo0Var.f38807f[0].requestFocus();
                AndroidUtilities.showKeyboard(lo0Var.f38807f[0]);
                return;
            case 1:
                this.f38447b.t0();
                return;
            case 2:
                lo0 lo0Var2 = this.f38447b;
                lo0Var2.getMessagesController().newMessageCallback = null;
                if (lo0Var2.f38803c1 == 3 && !lo0Var2.isFinishing()) {
                    lo0Var2.f38803c1 = 4;
                    ko0 ko0Var = lo0Var2.W0;
                    if (ko0Var != null) {
                        ko0Var.a(4);
                    }
                    lo0Var2.finishFragment();
                    return;
                } else if (lo0Var2.f38803c1 == 1 && !lo0Var2.isFinishing()) {
                    lo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                lo0 lo0Var3 = this.f38447b;
                if (lo0Var3.f38796a0 != null) {
                    lo0Var3.w0();
                    lo0Var3.f38796a0 = null;
                    return;
                }
                return;
        }
    }
}
