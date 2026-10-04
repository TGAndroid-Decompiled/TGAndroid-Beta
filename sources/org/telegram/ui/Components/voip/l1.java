package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;
public final class l1 implements Runnable {
    public final int f31969a;
    public final p1 f31970b;
    public final nj0 f31971c;

    public l1(p1 p1Var, nj0 nj0Var, int i10) {
        this.f31969a = i10;
        this.f31970b = p1Var;
        this.f31971c = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31969a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f31970b, this.f31971c, 1));
                return;
            default:
                this.f31970b.removeView(this.f31971c);
                return;
        }
    }
}
