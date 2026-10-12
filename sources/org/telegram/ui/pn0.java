package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class pn0 extends TimerTask {
    public final qn0 f39266a;

    public pn0(qn0 qn0Var) {
        this.f39266a = qn0Var;
    }

    @Override
    public final void run() {
        qn0 qn0Var = this.f39266a;
        if (qn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        qn0Var.f39507y = (int) (qn0Var.f39507y - (currentTimeMillis - qn0Var.F));
        qn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new yk0(this, 7));
    }
}
