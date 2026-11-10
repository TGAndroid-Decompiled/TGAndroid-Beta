package org.telegram.ui;

import java.util.TimerTask;
public final class id0 extends TimerTask {
    public final int f46621a;
    public final jd0 f46622b;

    public id0(jd0 jd0Var, int i7) {
        this.f46621a = i7;
        this.f46622b = jd0Var;
    }

    @Override
    public final void run() {
        switch (this.f46621a) {
            case 0:
                org.telegram.messenger.g0.h3(new kz(this, 26));
                return;
            default:
                if (this.f46622b.T != null) {
                    org.telegram.messenger.g0.h3(new kz(this, 27));
                    return;
                }
                return;
        }
    }
}
