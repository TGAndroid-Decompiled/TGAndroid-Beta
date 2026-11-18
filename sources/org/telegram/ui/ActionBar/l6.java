package org.telegram.ui.ActionBar;

import org.telegram.messenger.ks;
public final class l6 implements Runnable {
    public final int f29207a;
    public final m6 f29208b;

    public l6(m6 m6Var, int i7) {
        this.f29207a = i7;
        this.f29208b = m6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f29207a;
        m6 m6Var = this.f29208b;
        switch (i7) {
            case 0:
                m6Var.s();
                return;
            default:
                ks.e().k(273, m6Var, Boolean.TRUE, null, -1);
                return;
        }
    }
}
