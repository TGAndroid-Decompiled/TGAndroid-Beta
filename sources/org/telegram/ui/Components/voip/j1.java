package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kj0;
public final class j1 implements Runnable {
    public final int f28191a;
    public final n1 f28192b;
    public final kj0 f28193c;

    public j1(n1 n1Var, kj0 kj0Var, int i10) {
        this.f28191a = i10;
        this.f28192b = n1Var;
        this.f28193c = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f28191a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j1(this.f28192b, this.f28193c, 1));
                return;
            default:
                this.f28192b.removeView(this.f28193c);
                return;
        }
    }
}
