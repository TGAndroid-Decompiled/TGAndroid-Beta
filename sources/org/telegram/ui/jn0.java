package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class jn0 extends TimerTask {
    public final kn0 f34955a;

    public jn0(kn0 kn0Var) {
        this.f34955a = kn0Var;
    }

    @Override
    public final void run() {
        kn0 kn0Var = this.f34955a;
        if (kn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        kn0Var.f35198y = (int) (kn0Var.f35198y - (currentTimeMillis - kn0Var.F));
        kn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new pl0(this, 6));
    }
}
