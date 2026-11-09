package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;
public final class q9 implements Runnable {
    public final int f43022a;
    public final v9 f43023b;

    public q9(v9 v9Var, int i7) {
        this.f43022a = i7;
        this.f43023b = v9Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43022a;
        v9 v9Var = this.f43023b;
        switch (i7) {
            case 0:
                v9Var.f43226d0 = null;
                return;
            default:
                hc.a0(v9Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                return;
        }
    }
}
