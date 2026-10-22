package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class by0 implements Runnable {
    public final int f25058a;
    public final qy0 f25059b;

    public by0(qy0 qy0Var, int i10) {
        this.f25058a = i10;
        this.f25059b = qy0Var;
    }

    @Override
    public final void run() {
        switch (this.f25058a) {
            case 0:
                this.f25059b.d.l();
                return;
            case 1:
                this.f25059b.d.l();
                return;
            case 2:
                qy0.v(this.f25059b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f25059b.L, 1);
                return;
            default:
                qy0.u(this.f25059b);
                return;
        }
    }
}
