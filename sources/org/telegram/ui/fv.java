package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fv implements Runnable {
    public final int f37099a;
    public final cy f37100b;
    public final TLRPC.TL_attachMenuBot f37101c;
    public final LaunchActivity d;

    public fv(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37099a = i10;
        this.f37100b = cyVar;
        this.f37101c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37099a) {
            case 0:
                cy.i0(this.f37100b, this.f37101c, this.d);
                return;
            default:
                cy.p0(this.f37100b, this.f37101c, this.d);
                return;
        }
    }
}
