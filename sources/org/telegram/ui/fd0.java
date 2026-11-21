package org.telegram.ui;

import java.util.TimerTask;
public final class fd0 extends TimerTask {
    public final int f47668a;
    public final gd0 f47669b;

    public fd0(gd0 gd0Var, int i7) {
        this.f47668a = i7;
        this.f47669b = gd0Var;
    }

    @Override
    public final void run() {
        switch (this.f47668a) {
            case 0:
                org.telegram.messenger.g0.g3(new lz(this, 26));
                return;
            default:
                if (this.f47669b.U != null) {
                    org.telegram.messenger.g0.g3(new lz(this, 27));
                    return;
                }
                return;
        }
    }
}
