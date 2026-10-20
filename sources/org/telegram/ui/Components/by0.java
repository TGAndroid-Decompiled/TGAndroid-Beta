package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class by0 implements Runnable {
    public final int f25055a;
    public final qy0 f25056b;

    public by0(qy0 qy0Var, int i10) {
        this.f25055a = i10;
        this.f25056b = qy0Var;
    }

    @Override
    public final void run() {
        switch (this.f25055a) {
            case 0:
                this.f25056b.d.l();
                return;
            case 1:
                this.f25056b.d.l();
                return;
            case 2:
                qy0.v(this.f25056b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f25056b.L, 1);
                return;
            default:
                qy0.u(this.f25056b);
                return;
        }
    }
}
