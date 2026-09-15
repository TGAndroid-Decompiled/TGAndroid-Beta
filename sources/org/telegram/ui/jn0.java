package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class jn0 extends TimerTask {
    public final kn0 f34942a;

    public jn0(kn0 kn0Var) {
        this.f34942a = kn0Var;
    }

    @Override
    public final void run() {
        kn0 kn0Var = this.f34942a;
        if (kn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        kn0Var.f35205y = (int) (kn0Var.f35205y - (currentTimeMillis - kn0Var.F));
        kn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new pl0(this, 6));
    }
}
