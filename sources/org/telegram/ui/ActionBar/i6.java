package org.telegram.ui.ActionBar;

import org.telegram.messenger.qs;
public final class i6 implements Runnable {
    public final int f27602a;
    public final j6 f27603b;

    public i6(j6 j6Var, int i7) {
        this.f27602a = i7;
        this.f27603b = j6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f27602a;
        j6 j6Var = this.f27603b;
        switch (i7) {
            case 0:
                j6Var.s();
                return;
            default:
                qs.e().k(270, j6Var, Boolean.TRUE, null, -1);
                return;
        }
    }
}
