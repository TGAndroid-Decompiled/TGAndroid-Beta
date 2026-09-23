package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bj0;
public final class k1 implements Runnable {
    public final int f29005a;
    public final o1 f29006b;
    public final bj0 f29007c;

    public k1(o1 o1Var, bj0 bj0Var, int i10) {
        this.f29005a = i10;
        this.f29006b = o1Var;
        this.f29007c = bj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29005a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f29006b, this.f29007c, 1));
                return;
            default:
                this.f29006b.removeView(this.f29007c);
                return;
        }
    }
}
