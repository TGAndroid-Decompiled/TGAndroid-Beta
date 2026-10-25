package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ak0;
public final class l1 implements Runnable {
    public final int f33933a;
    public final p1 f33934b;
    public final ak0 f33935c;

    public l1(p1 p1Var, ak0 ak0Var, int i10) {
        this.f33933a = i10;
        this.f33934b = p1Var;
        this.f33935c = ak0Var;
    }

    @Override
    public final void run() {
        switch (this.f33933a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f33934b, this.f33935c, 1));
                return;
            default:
                this.f33934b.removeView(this.f33935c);
                return;
        }
    }
}
