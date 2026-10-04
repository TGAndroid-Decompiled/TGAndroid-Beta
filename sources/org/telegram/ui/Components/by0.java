package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class by0 implements Runnable {
    public final int f25076a;
    public final qy0 f25077b;

    public by0(qy0 qy0Var, int i10) {
        this.f25076a = i10;
        this.f25077b = qy0Var;
    }

    @Override
    public final void run() {
        switch (this.f25076a) {
            case 0:
                this.f25077b.d.l();
                return;
            case 1:
                this.f25077b.d.l();
                return;
            case 2:
                qy0.t(this.f25077b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f25077b.L, 1);
                return;
            default:
                qy0.s(this.f25077b);
                return;
        }
    }
}
