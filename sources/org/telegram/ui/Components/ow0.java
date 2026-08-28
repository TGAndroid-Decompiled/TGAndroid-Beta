package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ow0 implements Runnable {
    public final int f31455a;
    public final cx0 f31456b;

    public ow0(cx0 cx0Var, int i9) {
        this.f31455a = i9;
        this.f31456b = cx0Var;
    }

    @Override
    public final void run() {
        switch (this.f31455a) {
            case 0:
                this.f31456b.d.l();
                return;
            case 1:
                this.f31456b.d.l();
                return;
            case 2:
                cx0.t(this.f31456b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f31456b.H, 1);
                return;
            default:
                cx0.s(this.f31456b);
                return;
        }
    }
}
