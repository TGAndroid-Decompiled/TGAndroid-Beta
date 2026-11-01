package org.telegram.ui;

import java.util.TimerTask;
public final class ke0 extends TimerTask {
    public final int f38857a;
    public final le0 f38858b;

    public ke0(le0 le0Var, int i10) {
        this.f38857a = i10;
        this.f38858b = le0Var;
    }

    @Override
    public final void run() {
        switch (this.f38857a) {
            case 0:
                org.telegram.messenger.i0.g3(new yy(this, 26));
                return;
            default:
                if (this.f38858b.T != null) {
                    org.telegram.messenger.i0.g3(new yy(this, 27));
                    return;
                }
                return;
        }
    }
}
