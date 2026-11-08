package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class du implements Runnable {
    public final int f45134a;
    public final ww f45135b;
    public final TLRPC.TL_attachMenuBot f45136c;
    public final LaunchActivity d;

    public du(ww wwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f45134a = i7;
        this.f45135b = wwVar;
        this.f45136c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f45134a) {
            case 0:
                ww.v0(this.f45135b, this.f45136c, this.d);
                return;
            default:
                ww.j0(this.f45135b, this.f45136c, this.d);
                return;
        }
    }
}
