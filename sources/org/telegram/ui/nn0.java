package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class nn0 extends TimerTask {
    public final on0 f38428a;

    public nn0(on0 on0Var) {
        this.f38428a = on0Var;
    }

    @Override
    public final void run() {
        on0 on0Var = this.f38428a;
        if (on0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        on0Var.f38718y = (int) (on0Var.f38718y - (currentTimeMillis - on0Var.F));
        on0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new xk0(this, 7));
    }
}
