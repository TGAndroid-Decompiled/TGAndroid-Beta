package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class h1 implements Runnable {
    public final int f28808a;
    public final f5 f28809b;
    public final org.telegram.ui.ActionBar.e2 f28810c;
    public final org.telegram.ui.ActionBar.r2 d;

    public h1(f5 f5Var, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.f28808a = i10;
        this.f28809b = f5Var;
        this.f28810c = e2Var;
        this.d = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f28808a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h1(this.f28809b, this.f28810c, this.d, 1));
                return;
            default:
                g5.d0(this.f28809b, this.f28810c, this.d);
                return;
        }
    }
}
