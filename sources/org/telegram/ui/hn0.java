package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class hn0 extends TimerTask {
    public final in0 f38517a;

    public hn0(in0 in0Var) {
        this.f38517a = in0Var;
    }

    @Override
    public final void run() {
        in0 in0Var = this.f38517a;
        if (in0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        in0Var.f38764y = (int) (in0Var.f38764y - (currentTimeMillis - in0Var.F));
        in0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new sk0(this, 7));
    }
}
