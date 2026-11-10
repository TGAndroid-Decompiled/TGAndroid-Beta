package org.telegram.ui.ActionBar;

import org.telegram.messenger.qs;
public final class k6 implements Runnable {
    public final int f27659a;
    public final l6 f27660b;

    public k6(l6 l6Var, int i7) {
        this.f27659a = i7;
        this.f27660b = l6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f27659a;
        l6 l6Var = this.f27660b;
        switch (i7) {
            case 0:
                l6Var.s();
                return;
            default:
                qs.e().k(270, l6Var, Boolean.TRUE, null, -1);
                return;
        }
    }
}
