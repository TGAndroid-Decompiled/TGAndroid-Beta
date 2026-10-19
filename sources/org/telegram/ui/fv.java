package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fv implements Runnable {
    public final int f37094a;
    public final cy f37095b;
    public final TLRPC.TL_attachMenuBot f37096c;
    public final LaunchActivity d;

    public fv(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37094a = i10;
        this.f37095b = cyVar;
        this.f37096c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37094a) {
            case 0:
                cy.i0(this.f37095b, this.f37096c, this.d);
                return;
            default:
                cy.p0(this.f37095b, this.f37096c, this.d);
                return;
        }
    }
}
