package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class iv implements Runnable {
    public final int f40273a;
    public final ey f40274b;
    public final TLRPC.TL_attachMenuBot f40275c;
    public final LaunchActivity d;

    public iv(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f40273a = i10;
        this.f40274b = eyVar;
        this.f40275c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f40273a) {
            case 0:
                ey.A0(this.f40274b, this.f40275c, this.d);
                return;
            default:
                ey.v0(this.f40274b, this.f40275c, this.d);
                return;
        }
    }
}
