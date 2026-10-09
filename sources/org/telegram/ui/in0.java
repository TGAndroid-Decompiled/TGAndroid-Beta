package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class in0 extends TimerTask {
    public final jn0 f38704a;

    public in0(jn0 jn0Var) {
        this.f38704a = jn0Var;
    }

    @Override
    public final void run() {
        jn0 jn0Var = this.f38704a;
        if (jn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        jn0Var.f38998y = (int) (jn0Var.f38998y - (currentTimeMillis - jn0Var.F));
        jn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new tk0(this, 7));
    }
}
