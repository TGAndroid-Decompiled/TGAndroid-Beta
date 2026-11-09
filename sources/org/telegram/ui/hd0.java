package org.telegram.ui;

import java.util.TimerTask;
public final class hd0 extends TimerTask {
    public final int f46296a;
    public final id0 f46297b;

    public hd0(id0 id0Var, int i7) {
        this.f46296a = i7;
        this.f46297b = id0Var;
    }

    @Override
    public final void run() {
        switch (this.f46296a) {
            case 0:
                org.telegram.messenger.g0.h3(new jz(this, 26));
                return;
            default:
                if (this.f46297b.T != null) {
                    org.telegram.messenger.g0.h3(new jz(this, 27));
                    return;
                }
                return;
        }
    }
}
