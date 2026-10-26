package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class h1 implements Runnable {
    public final int f28759a;
    public final f5 f28760b;
    public final org.telegram.ui.ActionBar.e2 f28761c;
    public final org.telegram.ui.ActionBar.r2 d;

    public h1(f5 f5Var, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.f28759a = i10;
        this.f28760b = f5Var;
        this.f28761c = e2Var;
        this.d = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f28759a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h1(this.f28760b, this.f28761c, this.d, 1));
                return;
            default:
                g5.d0(this.f28760b, this.f28761c, this.d);
                return;
        }
    }
}
