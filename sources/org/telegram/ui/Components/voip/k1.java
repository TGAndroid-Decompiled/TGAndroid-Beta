package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kj0;
public final class k1 implements Runnable {
    public final int f29437a;
    public final o1 f29438b;
    public final kj0 f29439c;

    public k1(o1 o1Var, kj0 kj0Var, int i10) {
        this.f29437a = i10;
        this.f29438b = o1Var;
        this.f29439c = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29437a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f29438b, this.f29439c, 1));
                return;
            default:
                this.f29438b.removeView(this.f29439c);
                return;
        }
    }
}
