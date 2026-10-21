package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fv implements Runnable {
    public final int f37095a;
    public final cy f37096b;
    public final TLRPC.TL_attachMenuBot f37097c;
    public final LaunchActivity d;

    public fv(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37095a = i10;
        this.f37096b = cyVar;
        this.f37097c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37095a) {
            case 0:
                cy.i0(this.f37096b, this.f37097c, this.d);
                return;
            default:
                cy.p0(this.f37096b, this.f37097c, this.d);
                return;
        }
    }
}
