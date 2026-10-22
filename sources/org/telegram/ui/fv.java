package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fv implements Runnable {
    public final int f37098a;
    public final cy f37099b;
    public final TLRPC.TL_attachMenuBot f37100c;
    public final LaunchActivity d;

    public fv(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37098a = i10;
        this.f37099b = cyVar;
        this.f37100c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37098a) {
            case 0:
                cy.i0(this.f37099b, this.f37100c, this.d);
                return;
            default:
                cy.p0(this.f37099b, this.f37100c, this.d);
                return;
        }
    }
}
