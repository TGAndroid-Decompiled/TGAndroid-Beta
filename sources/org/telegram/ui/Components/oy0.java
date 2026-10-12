package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class oy0 implements Runnable {
    public final int f29325a;
    public final dz0 f29326b;

    public oy0(dz0 dz0Var, int i10) {
        this.f29325a = i10;
        this.f29326b = dz0Var;
    }

    @Override
    public final void run() {
        switch (this.f29325a) {
            case 0:
                this.f29326b.d.l();
                return;
            case 1:
                this.f29326b.d.l();
                return;
            case 2:
                dz0.v(this.f29326b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f29326b.L, 1);
                return;
            default:
                dz0.u(this.f29326b);
                return;
        }
    }
}
