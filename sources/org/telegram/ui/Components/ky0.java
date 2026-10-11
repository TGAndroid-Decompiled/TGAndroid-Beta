package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ky0 implements Runnable {
    public final int f28114a;
    public final zy0 f28115b;

    public ky0(zy0 zy0Var, int i10) {
        this.f28114a = i10;
        this.f28115b = zy0Var;
    }

    @Override
    public final void run() {
        switch (this.f28114a) {
            case 0:
                this.f28115b.d.l();
                return;
            case 1:
                this.f28115b.d.l();
                return;
            case 2:
                zy0.v(this.f28115b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f28115b.L, 1);
                return;
            default:
                zy0.u(this.f28115b);
                return;
        }
    }
}
