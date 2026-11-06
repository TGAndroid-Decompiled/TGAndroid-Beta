package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.hc;
public final class s9 implements Runnable {
    public final int f43117a;
    public final x9 f43118b;

    public s9(x9 x9Var, int i7) {
        this.f43117a = i7;
        this.f43118b = x9Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43117a;
        x9 x9Var = this.f43118b;
        switch (i7) {
            case 0:
                x9Var.f43315d0 = null;
                return;
            default:
                hc.a0(x9Var).N(hd.M0(2131745862, null), hd.M0(2131751106, null)).j();
                return;
        }
    }
}
