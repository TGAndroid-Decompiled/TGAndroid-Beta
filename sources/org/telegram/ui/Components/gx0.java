package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class gx0 implements Runnable {
    public final int f24467a;
    public final vx0 f24468b;

    public gx0(vx0 vx0Var, int i10) {
        this.f24467a = i10;
        this.f24468b = vx0Var;
    }

    @Override
    public final void run() {
        switch (this.f24467a) {
            case 0:
                this.f24468b.d.l();
                return;
            case 1:
                this.f24468b.d.l();
                return;
            case 2:
                vx0.t(this.f24468b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f24468b.L, 1);
                return;
            default:
                vx0.s(this.f24468b);
                return;
        }
    }
}
