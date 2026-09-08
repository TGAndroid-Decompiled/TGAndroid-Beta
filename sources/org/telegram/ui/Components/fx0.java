package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class fx0 implements Runnable {
    public final int f26219a;
    public final ux0 f26220b;

    public fx0(ux0 ux0Var, int i10) {
        this.f26219a = i10;
        this.f26220b = ux0Var;
    }

    @Override
    public final void run() {
        switch (this.f26219a) {
            case 0:
                this.f26220b.d.l();
                return;
            case 1:
                this.f26220b.d.l();
                return;
            case 2:
                ux0.t(this.f26220b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f26220b.L, 1);
                return;
            default:
                ux0.s(this.f26220b);
                return;
        }
    }
}
