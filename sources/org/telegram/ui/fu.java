package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fu implements Runnable {
    public final int f47188a;
    public final yw f47189b;
    public final TLRPC.TL_attachMenuBot f47190c;
    public final LaunchActivity d;

    public fu(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f47188a = i7;
        this.f47189b = ywVar;
        this.f47190c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f47188a) {
            case 0:
                yw.v0(this.f47189b, this.f47190c, this.d);
                return;
            default:
                yw.j0(this.f47189b, this.f47190c, this.d);
                return;
        }
    }
}
