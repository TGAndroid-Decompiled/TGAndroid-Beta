package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class oo implements Runnable {
    public final int f36853a;
    public final long f36854b;
    public final long f36855c;
    public final org.telegram.ui.ActionBar.p2 d;

    public oo(org.telegram.ui.ActionBar.p2 p2Var, long j10, long j11, int i10) {
        this.f36853a = i10;
        this.d = p2Var;
        this.f36854b = j10;
        this.f36855c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.w51 w51Var;
        switch (this.f36853a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f36854b, this.f36855c, new f5((ro) this.d, 4));
                return;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                y1Var.f39661f = this.f36854b;
                y1Var.h = this.f36855c;
                org.telegram.ui.Components.a61 a61Var = y1Var.f23568a;
                if (a61Var != null && (w51Var = a61Var.V2) != null && a61Var.D) {
                    w51Var.N(true);
                    return;
                }
                return;
        }
    }
}
