package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class sx0 implements Runnable {
    public final int f28383a;
    public final hy0 f28384b;

    public sx0(hy0 hy0Var, int i10) {
        this.f28383a = i10;
        this.f28384b = hy0Var;
    }

    @Override
    public final void run() {
        switch (this.f28383a) {
            case 0:
                this.f28384b.d.l();
                return;
            case 1:
                this.f28384b.d.l();
                return;
            case 2:
                hy0.t(this.f28384b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f28384b.L, 1);
                return;
            default:
                hy0.s(this.f28384b);
                return;
        }
    }
}
