package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class dy0 implements Runnable {
    public final int f25862a;
    public final sy0 f25863b;

    public dy0(sy0 sy0Var, int i10) {
        this.f25862a = i10;
        this.f25863b = sy0Var;
    }

    @Override
    public final void run() {
        switch (this.f25862a) {
            case 0:
                this.f25863b.d.l();
                return;
            case 1:
                this.f25863b.d.l();
                return;
            case 2:
                sy0.v(this.f25863b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f25863b.L, 1);
                return;
            default:
                sy0.u(this.f25863b);
                return;
        }
    }
}
