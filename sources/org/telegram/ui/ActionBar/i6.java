package org.telegram.ui.ActionBar;

import org.telegram.messenger.hs;
public final class i6 implements Runnable {
    public final int f27647a;
    public final j6 f27648b;

    public i6(j6 j6Var, int i3) {
        this.f27647a = i3;
        this.f27648b = j6Var;
    }

    @Override
    public final void run() {
        int i3 = this.f27647a;
        j6 j6Var = this.f27648b;
        switch (i3) {
            case 0:
                j6Var.s();
                return;
            default:
                hs.e().k(270, j6Var, Boolean.TRUE, null, -1);
                return;
        }
    }
}
