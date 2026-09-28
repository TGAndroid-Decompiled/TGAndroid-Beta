package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;
public final class l1 implements Runnable {
    public final int f29371a;
    public final p1 f29372b;
    public final nj0 f29373c;

    public l1(p1 p1Var, nj0 nj0Var, int i10) {
        this.f29371a = i10;
        this.f29372b = p1Var;
        this.f29373c = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29371a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f29372b, this.f29373c, 1));
                return;
            default:
                this.f29372b.removeView(this.f29373c);
                return;
        }
    }
}
