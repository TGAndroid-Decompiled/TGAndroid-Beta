package org.telegram.ui;

import org.telegram.messenger.MessagesController;

public final class fo implements Runnable {

    public final int f38173a;

    public final long f38174b;

    public final long f38175c;
    public final org.telegram.ui.ActionBar.n2 d;

    public fo(org.telegram.ui.ActionBar.n2 n2Var, long j10, long j11, int i10) {
        this.f38173a = i10;
        this.d = n2Var;
        this.f38174b = j10;
        this.f38175c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.b51 b51Var;
        switch (this.f38173a) {
            case 0:
                jo joVar = (jo) this.d;
                MessagesController.getInstance(joVar.currentAccount).unlinkCommunity(this.f38174b, this.f38175c, new b5(joVar, 4));
                break;
            default:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.d;
                v1Var.f44018f = this.f38174b;
                v1Var.h = this.f38175c;
                org.telegram.ui.Components.e51 e51Var = v1Var.f28261a;
                if (e51Var != null && (b51Var = e51Var.U2) != null && e51Var.C) {
                    b51Var.N(true);
                    break;
                }
                break;
        }
    }
}
