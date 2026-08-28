package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gv implements Runnable {
    public final int f38605a;
    public final dy f38606b;
    public final TLRPC.TL_attachMenuBot f38607c;
    public final LaunchActivity d;

    public gv(dy dyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i9) {
        this.f38605a = i9;
        this.f38606b = dyVar;
        this.f38607c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f38605a) {
            case 0:
                dy.u0(this.f38606b, this.f38607c, this.d);
                return;
            default:
                dy.v0(this.f38606b, this.f38607c, this.d);
                return;
        }
    }
}
