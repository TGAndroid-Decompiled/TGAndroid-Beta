package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hv implements Runnable {
    public final int f37659a;
    public final ey f37660b;
    public final TLRPC.TL_attachMenuBot f37661c;
    public final LaunchActivity d;

    public hv(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37659a = i10;
        this.f37660b = eyVar;
        this.f37661c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37659a) {
            case 0:
                ey.i0(this.f37660b, this.f37661c, this.d);
                return;
            default:
                ey.p0(this.f37660b, this.f37661c, this.d);
                return;
        }
    }
}
