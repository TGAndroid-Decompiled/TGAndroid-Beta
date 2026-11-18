package org.telegram.ui.ActionBar;

import org.telegram.messenger.ks;
public final class l6 implements Runnable {
    public final int f29209a;
    public final m6 f29210b;

    public l6(m6 m6Var, int i7) {
        this.f29209a = i7;
        this.f29210b = m6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f29209a;
        m6 m6Var = this.f29210b;
        switch (i7) {
            case 0:
                m6Var.s();
                return;
            default:
                ks.e().k(272, m6Var, Boolean.TRUE, null, -1);
                return;
        }
    }
}
