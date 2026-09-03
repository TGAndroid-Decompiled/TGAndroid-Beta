package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class an0 extends TimerTask {
    public final bn0 f32617a;

    public an0(bn0 bn0Var) {
        this.f32617a = bn0Var;
    }

    @Override
    public final void run() {
        bn0 bn0Var = this.f32617a;
        if (bn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        bn0Var.f32923y = (int) (bn0Var.f32923y - (currentTimeMillis - bn0Var.C));
        bn0Var.C = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new gl0(this, 6));
    }
}
