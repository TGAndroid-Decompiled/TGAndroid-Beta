package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fu implements Runnable {
    public final int f45789a;
    public final yw f45790b;
    public final TLRPC.TL_attachMenuBot f45791c;
    public final LaunchActivity d;

    public fu(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f45789a = i7;
        this.f45790b = ywVar;
        this.f45791c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f45789a) {
            case 0:
                yw.v0(this.f45790b, this.f45791c, this.d);
                return;
            default:
                yw.j0(this.f45790b, this.f45791c, this.d);
                return;
        }
    }
}
