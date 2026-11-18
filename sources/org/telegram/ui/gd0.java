package org.telegram.ui;

import java.util.TimerTask;
public final class gd0 extends TimerTask {
    public final int f47978a;
    public final hd0 f47979b;

    public gd0(hd0 hd0Var, int i7) {
        this.f47978a = i7;
        this.f47979b = hd0Var;
    }

    @Override
    public final void run() {
        switch (this.f47978a) {
            case 0:
                org.telegram.messenger.g0.g3(new lz(this, 26));
                return;
            default:
                if (this.f47979b.U != null) {
                    org.telegram.messenger.g0.g3(new lz(this, 27));
                    return;
                }
                return;
        }
    }
}
