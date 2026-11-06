package org.telegram.ui;

import java.util.TimerTask;
public final class fd0 extends TimerTask {
    public final int f45607a;
    public final gd0 f45608b;

    public fd0(gd0 gd0Var, int i7) {
        this.f45607a = i7;
        this.f45608b = gd0Var;
    }

    @Override
    public final void run() {
        switch (this.f45607a) {
            case 0:
                org.telegram.messenger.g0.h3(new hz(this, 26));
                return;
            default:
                if (this.f45608b.T != null) {
                    org.telegram.messenger.g0.h3(new hz(this, 27));
                    return;
                }
                return;
        }
    }
}
