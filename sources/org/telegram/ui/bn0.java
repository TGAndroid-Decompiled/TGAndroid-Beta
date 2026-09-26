package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class bn0 extends TimerTask {
    public final cn0 f32453a;

    public bn0(cn0 cn0Var) {
        this.f32453a = cn0Var;
    }

    @Override
    public final void run() {
        cn0 cn0Var = this.f32453a;
        if (cn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        cn0Var.f32759y = (int) (cn0Var.f32759y - (currentTimeMillis - cn0Var.F));
        cn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new il0(this, 6));
    }
}
