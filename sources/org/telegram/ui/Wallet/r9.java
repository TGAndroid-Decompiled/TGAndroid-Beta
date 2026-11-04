package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.ui.Components.fc;
public final class r9 implements Runnable {
    public final int f43134a;
    public final w9 f43135b;

    public r9(w9 w9Var, int i3) {
        this.f43134a = i3;
        this.f43135b = w9Var;
    }

    @Override
    public final void run() {
        int i3 = this.f43134a;
        w9 w9Var = this.f43135b;
        switch (i3) {
            case 0:
                w9Var.f43362e0 = null;
                return;
            default:
                fc.a0(w9Var).N(bd.M0(2131745871, null), bd.M0(2131751106, null)).j();
                return;
        }
    }
}
