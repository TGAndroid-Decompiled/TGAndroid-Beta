package org.telegram.ui.ActionBar;

import org.telegram.messenger.ns;
public final class h6 implements Runnable {
    public final int f28640a;
    public final i6 f28641b;

    public h6(i6 i6Var, int i7) {
        this.f28640a = i7;
        this.f28641b = i6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f28640a;
        i6 i6Var = this.f28641b;
        switch (i7) {
            case 0:
                i6Var.s();
                return;
            default:
                ns.e().k(270, i6Var, Boolean.TRUE, null, -1);
                return;
        }
    }
}
