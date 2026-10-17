package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gv implements Runnable {
    public final int f37348a;
    public final ey f37349b;
    public final TLRPC.TL_attachMenuBot f37350c;
    public final LaunchActivity d;

    public gv(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37348a = i10;
        this.f37349b = eyVar;
        this.f37350c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37348a) {
            case 0:
                ey.i0(this.f37349b, this.f37350c, this.d);
                return;
            default:
                ey.p0(this.f37349b, this.f37350c, this.d);
                return;
        }
    }
}
