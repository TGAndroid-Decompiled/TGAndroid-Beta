package org.telegram.ui;

import java.util.TimerTask;
public final class cd0 extends TimerTask {
    public final int f44320a;
    public final dd0 f44321b;

    public cd0(dd0 dd0Var, int i3) {
        this.f44320a = i3;
        this.f44321b = dd0Var;
    }

    @Override
    public final void run() {
        switch (this.f44320a) {
            case 0:
                org.telegram.messenger.g0.h3(new fz(this, 25));
                return;
            default:
                if (this.f44321b.U != null) {
                    org.telegram.messenger.g0.h3(new fz(this, 26));
                    return;
                }
                return;
        }
    }
}
