package org.telegram.ui;

import java.util.TimerTask;
public final class el0 extends TimerTask {
    public final fl0 f36871a;

    public el0(fl0 fl0Var) {
        this.f36871a = fl0Var;
    }

    @Override
    public final void run() {
        fl0 fl0Var = this.f36871a;
        if (fl0Var.f37180w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        fl0Var.D = (int) (fl0Var.D - (currentTimeMillis - fl0Var.F));
        fl0Var.F = currentTimeMillis;
        org.telegram.messenger.i0.g3(new kg0(this, 9));
    }
}
