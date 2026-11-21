package org.telegram.ui;

import java.util.TimerTask;
public final class ck0 extends TimerTask {
    public final dk0 f46587a;

    public ck0(dk0 dk0Var) {
        this.f46587a = dk0Var;
    }

    @Override
    public final void run() {
        dk0 dk0Var = this.f46587a;
        if (dk0Var.f47003w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        dk0Var.E = (int) (dk0Var.E - (currentTimeMillis - dk0Var.G));
        dk0Var.G = currentTimeMillis;
        org.telegram.messenger.g0.g3(new hf0(this, 9));
    }
}
