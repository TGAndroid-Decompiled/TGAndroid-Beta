package org.telegram.ui.ActionBar;

import org.telegram.messenger.qs;
public final class j6 implements Runnable {
    public final int f27632a;
    public final k6 f27633b;

    public j6(k6 k6Var, int i7) {
        this.f27632a = i7;
        this.f27633b = k6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f27632a;
        k6 k6Var = this.f27633b;
        switch (i7) {
            case 0:
                k6Var.s();
                return;
            default:
                qs.e().k(270, k6Var, Boolean.TRUE, null, -1);
                return;
        }
    }
}
