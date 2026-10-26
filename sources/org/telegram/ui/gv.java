package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gv implements Runnable {
    public final int f39785a;
    public final cy f39786b;
    public final TLRPC.TL_attachMenuBot f39787c;
    public final LaunchActivity d;

    public gv(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f39785a = i10;
        this.f39786b = cyVar;
        this.f39787c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f39785a) {
            case 0:
                cy.A0(this.f39786b, this.f39787c, this.d);
                return;
            default:
                cy.v0(this.f39786b, this.f39787c, this.d);
                return;
        }
    }
}
