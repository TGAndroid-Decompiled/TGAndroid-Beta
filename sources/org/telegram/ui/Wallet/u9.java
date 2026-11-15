package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;
public final class u9 implements Runnable {
    public final int f44576a;
    public final z9 f44577b;

    public u9(z9 z9Var, int i7) {
        this.f44576a = i7;
        this.f44577b = z9Var;
    }

    @Override
    public final void run() {
        int i7 = this.f44576a;
        z9 z9Var = this.f44577b;
        switch (i7) {
            case 0:
                z9Var.f44858e0 = null;
                return;
            default:
                cc.a0(z9Var).N(hd.M0(2131745861, null), hd.M0(2131751105, null)).j();
                return;
        }
    }
}
