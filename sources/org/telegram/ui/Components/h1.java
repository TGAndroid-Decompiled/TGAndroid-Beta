package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class h1 implements Runnable {
    public final int f28757a;
    public final f5 f28758b;
    public final org.telegram.ui.ActionBar.e2 f28759c;
    public final org.telegram.ui.ActionBar.r2 d;

    public h1(f5 f5Var, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.f28757a = i10;
        this.f28758b = f5Var;
        this.f28759c = e2Var;
        this.d = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f28757a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h1(this.f28758b, this.f28759c, this.d, 1));
                return;
            default:
                g5.d0(this.f28758b, this.f28759c, this.d);
                return;
        }
    }
}
