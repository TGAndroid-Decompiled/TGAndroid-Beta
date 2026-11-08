package org.telegram.ui;

import java.util.TimerTask;
public final class fd0 extends TimerTask {
    public final int f45588a;
    public final gd0 f45589b;

    public fd0(gd0 gd0Var, int i7) {
        this.f45588a = i7;
        this.f45589b = gd0Var;
    }

    @Override
    public final void run() {
        switch (this.f45588a) {
            case 0:
                org.telegram.messenger.g0.h3(new hz(this, 26));
                return;
            default:
                if (this.f45589b.T != null) {
                    org.telegram.messenger.g0.h3(new hz(this, 27));
                    return;
                }
                return;
        }
    }
}
