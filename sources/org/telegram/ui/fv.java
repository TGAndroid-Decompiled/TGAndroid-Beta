package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fv implements Runnable {
    public final int f37088a;
    public final cy f37089b;
    public final TLRPC.TL_attachMenuBot f37090c;
    public final LaunchActivity d;

    public fv(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37088a = i10;
        this.f37089b = cyVar;
        this.f37090c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37088a) {
            case 0:
                cy.i0(this.f37089b, this.f37090c, this.d);
                return;
            default:
                cy.p0(this.f37089b, this.f37090c, this.d);
                return;
        }
    }
}
