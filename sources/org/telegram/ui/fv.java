package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fv implements Runnable {
    public final int f37237a;
    public final zx f37238b;
    public final TLRPC.TL_attachMenuBot f37239c;
    public final LaunchActivity d;

    public fv(zx zxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37237a = i10;
        this.f37238b = zxVar;
        this.f37239c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37237a) {
            case 0:
                zx.v0(this.f37238b, this.f37239c, this.d);
                return;
            default:
                zx.j0(this.f37238b, this.f37239c, this.d);
                return;
        }
    }
}
