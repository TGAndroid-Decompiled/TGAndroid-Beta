package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class sx0 implements Runnable {
    public final int f28384a;
    public final hy0 f28385b;

    public sx0(hy0 hy0Var, int i10) {
        this.f28384a = i10;
        this.f28385b = hy0Var;
    }

    @Override
    public final void run() {
        switch (this.f28384a) {
            case 0:
                this.f28385b.d.l();
                return;
            case 1:
                this.f28385b.d.l();
                return;
            case 2:
                hy0.t(this.f28385b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f28385b.L, 1);
                return;
            default:
                hy0.s(this.f28385b);
                return;
        }
    }
}
