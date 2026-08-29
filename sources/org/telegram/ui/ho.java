package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class ho implements Runnable {
    public final int f38969a;
    public final long f38970b;
    public final long f38971c;
    public final org.telegram.ui.ActionBar.o2 d;

    public ho(org.telegram.ui.ActionBar.o2 o2Var, long j10, long j11, int i10) {
        this.f38969a = i10;
        this.d = o2Var;
        this.f38970b = j10;
        this.f38971c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.k51 k51Var;
        switch (this.f38969a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f38970b, this.f38971c, new b5((ko) this.d, 4));
                return;
            default:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.d;
                w1Var.f44237f = this.f38970b;
                w1Var.h = this.f38971c;
                org.telegram.ui.Components.o51 o51Var = w1Var.f31601a;
                if (o51Var != null && (k51Var = o51Var.U2) != null && o51Var.C) {
                    k51Var.N(true);
                    return;
                }
                return;
        }
    }
}
