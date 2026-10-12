package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;
public final class i1 implements Runnable {
    public final int f30226a;
    public final m1 f30227b;
    public final bk0 f30228c;

    public i1(m1 m1Var, bk0 bk0Var, int i10) {
        this.f30226a = i10;
        this.f30227b = m1Var;
        this.f30228c = bk0Var;
    }

    @Override
    public final void run() {
        switch (this.f30226a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f30227b, this.f30228c, 1));
                return;
            default:
                this.f30227b.removeView(this.f30228c);
                return;
        }
    }
}
