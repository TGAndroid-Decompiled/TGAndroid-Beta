package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class my0 implements Runnable {
    public final int f30775a;
    public final cz0 f30776b;

    public my0(cz0 cz0Var, int i10) {
        this.f30775a = i10;
        this.f30776b = cz0Var;
    }

    @Override
    public final void run() {
        switch (this.f30775a) {
            case 0:
                this.f30776b.d.l();
                return;
            case 1:
                this.f30776b.d.l();
                return;
            case 2:
                cz0.u(this.f30776b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f30776b.L, 1);
                return;
            default:
                cz0.t(this.f30776b);
                return;
        }
    }
}
