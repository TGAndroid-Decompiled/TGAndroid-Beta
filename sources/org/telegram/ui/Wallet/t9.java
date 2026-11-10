package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.gc;
public final class t9 implements Runnable {
    public final int f43193a;
    public final y9 f43194b;

    public t9(y9 y9Var, int i7) {
        this.f43193a = i7;
        this.f43194b = y9Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43193a;
        y9 y9Var = this.f43194b;
        switch (i7) {
            case 0:
                y9Var.f43395d0 = null;
                return;
            default:
                gc.a0(y9Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                return;
        }
    }
}
