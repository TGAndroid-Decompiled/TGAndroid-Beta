package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ey0 implements Runnable {
    public final int f26098a;
    public final ty0 f26099b;

    public ey0(ty0 ty0Var, int i10) {
        this.f26098a = i10;
        this.f26099b = ty0Var;
    }

    @Override
    public final void run() {
        switch (this.f26098a) {
            case 0:
                this.f26099b.d.l();
                return;
            case 1:
                this.f26099b.d.l();
                return;
            case 2:
                ty0.v(this.f26099b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f26099b.L, 1);
                return;
            default:
                ty0.u(this.f26099b);
                return;
        }
    }
}
