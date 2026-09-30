package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;
public final class l1 implements Runnable {
    public final int f29361a;
    public final p1 f29362b;
    public final nj0 f29363c;

    public l1(p1 p1Var, nj0 nj0Var, int i10) {
        this.f29361a = i10;
        this.f29362b = p1Var;
        this.f29363c = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29361a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f29362b, this.f29363c, 1));
                return;
            default:
                this.f29362b.removeView(this.f29363c);
                return;
        }
    }
}
