package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class an0 extends TimerTask {
    public final bn0 f32275a;

    public an0(bn0 bn0Var) {
        this.f32275a = bn0Var;
    }

    @Override
    public final void run() {
        bn0 bn0Var = this.f32275a;
        if (bn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        bn0Var.f32538y = (int) (bn0Var.f32538y - (currentTimeMillis - bn0Var.F));
        bn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new il0(this, 6));
    }
}
