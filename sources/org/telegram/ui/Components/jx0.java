package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class jx0 implements Runnable {
    public final int f28221a;
    public final yx0 f28222b;

    public jx0(yx0 yx0Var, int i10) {
        this.f28221a = i10;
        this.f28222b = yx0Var;
    }

    @Override
    public final void run() {
        switch (this.f28221a) {
            case 0:
                this.f28222b.d.l();
                return;
            case 1:
                this.f28222b.d.l();
                return;
            case 2:
                yx0.t(this.f28222b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f28222b.I, 1);
                return;
            default:
                yx0.s(this.f28222b);
                return;
        }
    }
}
