package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ak0;
public final class i1 implements Runnable {
    public final int f31623a;
    public final m1 f31624b;
    public final ak0 f31625c;

    public i1(m1 m1Var, ak0 ak0Var, int i10) {
        this.f31623a = i10;
        this.f31624b = m1Var;
        this.f31625c = ak0Var;
    }

    @Override
    public final void run() {
        switch (this.f31623a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31624b, this.f31625c, 1));
                return;
            default:
                this.f31624b.removeView(this.f31625c);
                return;
        }
    }
}
