package org.telegram.ui;

import java.util.TimerTask;
public final class ak0 extends TimerTask {
    public final bk0 f45737a;

    public ak0(bk0 bk0Var) {
        this.f45737a = bk0Var;
    }

    @Override
    public final void run() {
        bk0 bk0Var = this.f45737a;
        if (bk0Var.f46095w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        bk0Var.E = (int) (bk0Var.E - (currentTimeMillis - bk0Var.G));
        bk0Var.G = currentTimeMillis;
        org.telegram.messenger.g0.g3(new gf0(this, 9));
    }
}
