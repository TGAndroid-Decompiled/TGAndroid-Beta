package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class jn0 extends TimerTask {
    public final kn0 f34141a;

    public jn0(kn0 kn0Var) {
        this.f34141a = kn0Var;
    }

    @Override
    public final void run() {
        kn0 kn0Var = this.f34141a;
        if (kn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        kn0Var.f34429y = (int) (kn0Var.f34429y - (currentTimeMillis - kn0Var.F));
        kn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ql0(this, 6));
    }
}
