package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class fn0 extends TimerTask {
    public final gn0 f39405a;

    public fn0(gn0 gn0Var) {
        this.f39405a = gn0Var;
    }

    @Override
    public final void run() {
        gn0 gn0Var = this.f39405a;
        if (gn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        gn0Var.f39660y = (int) (gn0Var.f39660y - (currentTimeMillis - gn0Var.F));
        gn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new nj0(this, 8));
    }
}
