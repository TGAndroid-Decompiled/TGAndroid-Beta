package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class tx0 implements Runnable {
    public final int f28672a;
    public final iy0 f28673b;

    public tx0(iy0 iy0Var, int i10) {
        this.f28672a = i10;
        this.f28673b = iy0Var;
    }

    @Override
    public final void run() {
        switch (this.f28672a) {
            case 0:
                this.f28673b.d.l();
                return;
            case 1:
                this.f28673b.d.l();
                return;
            case 2:
                iy0.t(this.f28673b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f28673b.L, 1);
                return;
            default:
                iy0.s(this.f28673b);
                return;
        }
    }
}
