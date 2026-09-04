package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class kn0 extends TimerTask {
    public final ln0 f38095a;

    public kn0(ln0 ln0Var) {
        this.f38095a = ln0Var;
    }

    @Override
    public final void run() {
        ln0 ln0Var = this.f38095a;
        if (ln0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        ln0Var.f38418y = (int) (ln0Var.f38418y - (currentTimeMillis - ln0Var.F));
        ln0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new rl0(this, 6));
    }
}
