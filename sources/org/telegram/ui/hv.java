package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hv implements Runnable {
    public final int f37621a;
    public final ey f37622b;
    public final TLRPC.TL_attachMenuBot f37623c;
    public final LaunchActivity d;

    public hv(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37621a = i10;
        this.f37622b = eyVar;
        this.f37623c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37621a) {
            case 0:
                ey.i0(this.f37622b, this.f37623c, this.d);
                return;
            default:
                ey.p0(this.f37622b, this.f37623c, this.d);
                return;
        }
    }
}
