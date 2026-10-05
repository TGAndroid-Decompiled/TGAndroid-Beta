package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class cy0 implements Runnable {
    public final int f25547a;
    public final ry0 f25548b;

    public cy0(ry0 ry0Var, int i10) {
        this.f25547a = i10;
        this.f25548b = ry0Var;
    }

    @Override
    public final void run() {
        switch (this.f25547a) {
            case 0:
                this.f25548b.d.l();
                return;
            case 1:
                this.f25548b.d.l();
                return;
            case 2:
                ry0.t(this.f25548b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f25548b.L, 1);
                return;
            default:
                ry0.s(this.f25548b);
                return;
        }
    }
}
