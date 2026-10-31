package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gv implements Runnable {
    public final int f37651a;
    public final ay f37652b;
    public final TLRPC.TL_attachMenuBot f37653c;
    public final LaunchActivity d;

    public gv(ay ayVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37651a = i10;
        this.f37652b = ayVar;
        this.f37653c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37651a) {
            case 0:
                ay.u0(this.f37652b, this.f37653c, this.d);
                return;
            default:
                ay.i0(this.f37652b, this.f37653c, this.d);
                return;
        }
    }
}
