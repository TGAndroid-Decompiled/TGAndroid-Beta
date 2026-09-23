package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class no implements Runnable {
    public final int f35568a;
    public final long f35569b;
    public final long f35570c;
    public final org.telegram.ui.ActionBar.n2 d;

    public no(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f35568a = i10;
        this.d = n2Var;
        this.f35569b = j3;
        this.f35570c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.v51 v51Var;
        switch (this.f35568a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f35569b, this.f35570c, new c5((so) this.d, 4));
                return;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                y1Var.f38915f = this.f35569b;
                y1Var.h = this.f35570c;
                org.telegram.ui.Components.x51 x51Var = y1Var.f30163a;
                if (x51Var != null && (v51Var = x51Var.Y2) != null && x51Var.G) {
                    v51Var.N(true);
                    return;
                }
                return;
        }
    }
}
