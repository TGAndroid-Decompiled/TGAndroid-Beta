package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class zw0 implements Runnable {
    public final int f35438a;
    public final nx0 f35439b;

    public zw0(nx0 nx0Var, int i10) {
        this.f35438a = i10;
        this.f35439b = nx0Var;
    }

    @Override
    public final void run() {
        switch (this.f35438a) {
            case 0:
                this.f35439b.d.l();
                return;
            case 1:
                this.f35439b.d.l();
                return;
            case 2:
                nx0.t(this.f35439b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f35439b.H, 1);
                return;
            default:
                nx0.s(this.f35439b);
                return;
        }
    }
}
