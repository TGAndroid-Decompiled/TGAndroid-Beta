package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class mo implements Runnable {
    public final int f35726a;
    public final long f35727b;
    public final long f35728c;
    public final org.telegram.ui.ActionBar.m2 d;

    public mo(org.telegram.ui.ActionBar.m2 m2Var, long j3, long j10, int i10) {
        this.f35726a = i10;
        this.d = m2Var;
        this.f35727b = j3;
        this.f35728c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.m61 m61Var;
        switch (this.f35726a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f35727b, this.f35728c, new b5((ro) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f39385f = this.f35727b;
                z1Var.h = this.f35728c;
                org.telegram.ui.Components.o61 o61Var = z1Var.f27258a;
                if (o61Var != null && (m61Var = o61Var.f28778f3) != null && o61Var.G) {
                    m61Var.N(true);
                    return;
                }
                return;
        }
    }
}
