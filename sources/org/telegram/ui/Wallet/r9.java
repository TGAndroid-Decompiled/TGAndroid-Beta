package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;
public final class r9 implements Runnable {
    public final int f43104a;
    public final w9 f43105b;

    public r9(w9 w9Var, int i7) {
        this.f43104a = i7;
        this.f43105b = w9Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43104a;
        w9 w9Var = this.f43105b;
        switch (i7) {
            case 0:
                w9Var.f43308d0 = null;
                return;
            default:
                hc.a0(w9Var).N(id.M0(2131745864, null), id.M0(2131751106, null)).j();
                return;
        }
    }
}
