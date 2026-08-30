package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pv implements Runnable {
    public final int f37541a;
    public final oy f37542b;
    public final TLRPC.TL_attachMenuBot f37543c;
    public final LaunchActivity d;

    public pv(oy oyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37541a = i10;
        this.f37542b = oyVar;
        this.f37543c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37541a) {
            case 0:
                oy.v0(this.f37542b, this.f37543c, this.d);
                return;
            default:
                oy.w0(this.f37542b, this.f37543c, this.d);
                return;
        }
    }
}
