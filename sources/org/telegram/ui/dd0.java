package org.telegram.ui;

import java.util.TimerTask;
public final class dd0 extends TimerTask {
    public final int f46373a;
    public final ed0 f46374b;

    public dd0(ed0 ed0Var, int i7) {
        this.f46373a = i7;
        this.f46374b = ed0Var;
    }

    @Override
    public final void run() {
        switch (this.f46373a) {
            case 0:
                org.telegram.messenger.g0.h3(new iz(this, 26));
                return;
            default:
                if (this.f46374b.U != null) {
                    org.telegram.messenger.g0.h3(new iz(this, 27));
                    return;
                }
                return;
        }
    }
}
