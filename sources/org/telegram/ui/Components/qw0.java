package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

public final class qw0 implements Runnable {

    public final int f31988a;

    public final ex0 f31989b;

    public qw0(ex0 ex0Var, int i10) {
        this.f31988a = i10;
        this.f31989b = ex0Var;
    }

    @Override
    public final void run() {
        switch (this.f31988a) {
            case 0:
                this.f31989b.d.l();
                break;
            case 1:
                this.f31989b.d.l();
                break;
            case 2:
                ex0.u(this.f31989b);
                break;
            case 3:
                ex0 ex0Var = this.f31989b;
                MessagesController.getInstance(ex0Var.currentAccount).openByUserName("stickers", ex0Var.H, 1);
                break;
            default:
                ex0.t(this.f31989b);
                break;
        }
    }
}
