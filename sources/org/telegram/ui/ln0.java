package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ln0 extends TimerTask {
    public final mn0 f35590a;

    public ln0(mn0 mn0Var) {
        this.f35590a = mn0Var;
    }

    @Override
    public final void run() {
        mn0 mn0Var = this.f35590a;
        if (mn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        mn0Var.f35853y = (int) (mn0Var.f35853y - (currentTimeMillis - mn0Var.F));
        mn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new sl0(this, 6));
    }
}
