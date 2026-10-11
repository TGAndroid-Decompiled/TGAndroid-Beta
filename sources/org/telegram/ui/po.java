package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class po implements Runnable {
    public final int f40958a;
    public final long f40959b;
    public final long f40960c;
    public final org.telegram.ui.ActionBar.m2 d;

    public po(org.telegram.ui.ActionBar.m2 m2Var, long j3, long j10, int i10) {
        this.f40958a = i10;
        this.d = m2Var;
        this.f40959b = j3;
        this.f40960c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.d71 d71Var;
        switch (this.f40958a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f40959b, this.f40960c, new a5((uo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                y1Var.f43775f = this.f40959b;
                y1Var.h = this.f40960c;
                org.telegram.ui.Components.f71 f71Var = y1Var.f26675a;
                if (f71Var != null && (d71Var = f71Var.W2) != null && f71Var.G) {
                    d71Var.N(true);
                    return;
                }
                return;
        }
    }
}
