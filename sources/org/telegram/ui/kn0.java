package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class kn0 extends TimerTask {
    public final ln0 f35151a;

    public kn0(ln0 ln0Var) {
        this.f35151a = ln0Var;
    }

    @Override
    public final void run() {
        ln0 ln0Var = this.f35151a;
        if (ln0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        ln0Var.f35418y = (int) (ln0Var.f35418y - (currentTimeMillis - ln0Var.F));
        ln0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new sl0(this, 6));
    }
}
