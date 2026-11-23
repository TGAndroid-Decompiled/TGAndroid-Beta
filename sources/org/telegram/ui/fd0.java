package org.telegram.ui;

import java.util.TimerTask;
public final class fd0 extends TimerTask {
    public final int f47672a;
    public final gd0 f47673b;

    public fd0(gd0 gd0Var, int i7) {
        this.f47672a = i7;
        this.f47673b = gd0Var;
    }

    @Override
    public final void run() {
        switch (this.f47672a) {
            case 0:
                org.telegram.messenger.g0.g3(new lz(this, 26));
                return;
            default:
                if (this.f47673b.U != null) {
                    org.telegram.messenger.g0.g3(new lz(this, 27));
                    return;
                }
                return;
        }
    }
}
