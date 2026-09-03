package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jj0;
public final class h1 implements Runnable {
    public final int f29640a;
    public final l1 f29641b;
    public final jj0 f29642c;

    public h1(l1 l1Var, jj0 jj0Var, int i10) {
        this.f29640a = i10;
        this.f29641b = l1Var;
        this.f29642c = jj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29640a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h1(this.f29641b, this.f29642c, 1));
                return;
            default:
                this.f29641b.removeView(this.f29642c);
                return;
        }
    }
}
