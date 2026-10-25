package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gv implements Runnable {
    public final int f39782a;
    public final cy f39783b;
    public final TLRPC.TL_attachMenuBot f39784c;
    public final LaunchActivity d;

    public gv(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f39782a = i10;
        this.f39783b = cyVar;
        this.f39784c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f39782a) {
            case 0:
                cy.A0(this.f39783b, this.f39784c, this.d);
                return;
            default:
                cy.v0(this.f39783b, this.f39784c, this.d);
                return;
        }
    }
}
