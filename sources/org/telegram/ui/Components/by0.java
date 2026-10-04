package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class by0 implements Runnable {
    public final int f25082a;
    public final qy0 f25083b;

    public by0(qy0 qy0Var, int i10) {
        this.f25082a = i10;
        this.f25083b = qy0Var;
    }

    @Override
    public final void run() {
        switch (this.f25082a) {
            case 0:
                this.f25083b.d.l();
                return;
            case 1:
                this.f25083b.d.l();
                return;
            case 2:
                qy0.t(this.f25083b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f25083b.L, 1);
                return;
            default:
                qy0.s(this.f25083b);
                return;
        }
    }
}
