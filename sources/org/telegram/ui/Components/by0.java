package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class by0 implements Runnable {
    public final int f25077a;
    public final qy0 f25078b;

    public by0(qy0 qy0Var, int i10) {
        this.f25077a = i10;
        this.f25078b = qy0Var;
    }

    @Override
    public final void run() {
        switch (this.f25077a) {
            case 0:
                this.f25078b.d.l();
                return;
            case 1:
                this.f25078b.d.l();
                return;
            case 2:
                qy0.t(this.f25078b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f25078b.L, 1);
                return;
            default:
                qy0.s(this.f25078b);
                return;
        }
    }
}
