package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hv implements Runnable {
    public final int f39051a;
    public final fy f39052b;
    public final TLRPC.TL_attachMenuBot f39053c;
    public final LaunchActivity d;

    public hv(fy fyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f39051a = i10;
        this.f39052b = fyVar;
        this.f39053c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f39051a) {
            case 0:
                fy.v0(this.f39052b, this.f39053c, this.d);
                return;
            default:
                fy.w0(this.f39052b, this.f39053c, this.d);
                return;
        }
    }
}
