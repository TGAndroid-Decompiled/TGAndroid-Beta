package org.telegram.ui;

import java.util.TimerTask;
public final class fd0 extends TimerTask {
    public final int f47801a;
    public final gd0 f47802b;

    public fd0(gd0 gd0Var, int i7) {
        this.f47801a = i7;
        this.f47802b = gd0Var;
    }

    @Override
    public final void run() {
        switch (this.f47801a) {
            case 0:
                org.telegram.messenger.g0.g3(new kz(this, 26));
                return;
            default:
                if (this.f47802b.U != null) {
                    org.telegram.messenger.g0.g3(new kz(this, 27));
                    return;
                }
                return;
        }
    }
}
