package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class jv implements Runnable {

    public final int f39510a;

    public final gy f39511b;

    public final TLRPC.TL_attachMenuBot f39512c;
    public final LaunchActivity d;

    public jv(gy gyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f39510a = i10;
        this.f39511b = gyVar;
        this.f39512c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f39510a) {
            case 0:
                gy.v0(this.f39511b, this.f39512c, this.d);
                break;
            default:
                gy.w0(this.f39511b, this.f39512c, this.d);
                break;
        }
    }
}
