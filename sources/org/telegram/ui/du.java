package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class du implements Runnable {
    public final int f45140a;
    public final ww f45141b;
    public final TLRPC.TL_attachMenuBot f45142c;
    public final LaunchActivity d;

    public du(ww wwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f45140a = i7;
        this.f45141b = wwVar;
        this.f45142c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f45140a) {
            case 0:
                ww.v0(this.f45141b, this.f45142c, this.d);
                return;
            default:
                ww.j0(this.f45141b, this.f45142c, this.d);
                return;
        }
    }
}
