package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pi0;
public final class h1 implements Runnable {
    public final int f33553a;
    public final l1 f33554b;
    public final pi0 f33555c;

    public h1(l1 l1Var, pi0 pi0Var, int i9) {
        this.f33553a = i9;
        this.f33554b = l1Var;
        this.f33555c = pi0Var;
    }

    @Override
    public final void run() {
        switch (this.f33553a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h1(this.f33554b, this.f33555c, 1));
                return;
            default:
                this.f33554b.removeView(this.f33555c);
                return;
        }
    }
}
