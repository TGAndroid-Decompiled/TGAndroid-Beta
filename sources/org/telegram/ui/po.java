package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class po implements Runnable {
    public final int f40901a;
    public final long f40902b;
    public final long f40903c;
    public final org.telegram.ui.ActionBar.n2 d;

    public po(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f40901a = i10;
        this.d = n2Var;
        this.f40902b = j3;
        this.f40903c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.d71 d71Var;
        switch (this.f40901a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f40902b, this.f40903c, new b5((uo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f43608f = this.f40902b;
                z1Var.h = this.f40903c;
                org.telegram.ui.Components.f71 f71Var = z1Var.f26629a;
                if (f71Var != null && (d71Var = f71Var.W2) != null && f71Var.G) {
                    d71Var.N(true);
                    return;
                }
                return;
        }
    }
}
