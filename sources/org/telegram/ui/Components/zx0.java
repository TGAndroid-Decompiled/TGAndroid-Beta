package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class zx0 implements Runnable {
    public final int f33050a;
    public final oy0 f33051b;

    public zx0(oy0 oy0Var, int i10) {
        this.f33050a = i10;
        this.f33051b = oy0Var;
    }

    @Override
    public final void run() {
        switch (this.f33050a) {
            case 0:
                this.f33051b.d.l();
                return;
            case 1:
                this.f33051b.d.l();
                return;
            case 2:
                oy0.v(this.f33051b);
                return;
            case 3:
                MessagesController.getInstance(r0.currentAccount).openByUserName("stickers", this.f33051b.L, 1);
                return;
            default:
                oy0.t(this.f33051b);
                return;
        }
    }
}
