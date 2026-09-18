package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lj0;
public final class k1 implements Runnable {
    public final int f29330a;
    public final o1 f29331b;
    public final lj0 f29332c;

    public k1(o1 o1Var, lj0 lj0Var, int i10) {
        this.f29330a = i10;
        this.f29331b = o1Var;
        this.f29332c = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29330a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f29331b, this.f29332c, 1));
                return;
            default:
                this.f29331b.removeView(this.f29332c);
                return;
        }
    }
}
