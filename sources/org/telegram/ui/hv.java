package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hv implements Runnable {
    public final int f38027a;
    public final ey f38028b;
    public final TLRPC.TL_attachMenuBot f38029c;
    public final LaunchActivity d;

    public hv(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f38027a = i10;
        this.f38028b = eyVar;
        this.f38029c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f38027a) {
            case 0:
                ey.r0(this.f38028b, this.f38029c, this.d);
                return;
            default:
                ey.f0(this.f38028b, this.f38029c, this.d);
                return;
        }
    }
}
