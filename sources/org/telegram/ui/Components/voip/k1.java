package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bj0;
public final class k1 implements Runnable {
    public final int f29011a;
    public final o1 f29012b;
    public final bj0 f29013c;

    public k1(o1 o1Var, bj0 bj0Var, int i10) {
        this.f29011a = i10;
        this.f29012b = o1Var;
        this.f29013c = bj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29011a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f29012b, this.f29013c, 1));
                return;
            default:
                this.f29012b.removeView(this.f29013c);
                return;
        }
    }
}
