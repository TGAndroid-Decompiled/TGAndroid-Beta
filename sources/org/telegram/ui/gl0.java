package org.telegram.ui;

import java.util.TimerTask;
public final class gl0 extends TimerTask {
    public final hl0 f37594a;

    public gl0(hl0 hl0Var) {
        this.f37594a = hl0Var;
    }

    @Override
    public final void run() {
        hl0 hl0Var = this.f37594a;
        if (hl0Var.f37992w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        hl0Var.D = (int) (hl0Var.D - (currentTimeMillis - hl0Var.F));
        hl0Var.F = currentTimeMillis;
        org.telegram.messenger.i0.g3(new mg0(this, 9));
    }
}
