package org.telegram.ui.ActionBar;

import org.telegram.messenger.ks;
public final class k6 implements Runnable {
    public final int f29191a;
    public final l6 f29192b;

    public k6(l6 l6Var, int i7) {
        this.f29191a = i7;
        this.f29192b = l6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f29191a;
        l6 l6Var = this.f29192b;
        switch (i7) {
            case 0:
                l6Var.s();
                return;
            default:
                ks.e().k(273, l6Var, Boolean.TRUE, null, -1);
                return;
        }
    }
}
