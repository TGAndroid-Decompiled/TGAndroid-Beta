package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pv implements Runnable {
    public final int f36680a;
    public final qy f36681b;
    public final TLRPC.TL_attachMenuBot f36682c;
    public final LaunchActivity d;

    public pv(qy qyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f36680a = i10;
        this.f36681b = qyVar;
        this.f36682c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f36680a) {
            case 0:
                qy.w0(this.f36681b, this.f36682c, this.d);
                return;
            default:
                qy.x0(this.f36681b, this.f36682c, this.d);
                return;
        }
    }
}
