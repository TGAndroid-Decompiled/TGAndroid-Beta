package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class du implements Runnable {
    public final int f45139a;
    public final ww f45140b;
    public final TLRPC.TL_attachMenuBot f45141c;
    public final LaunchActivity d;

    public du(ww wwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f45139a = i7;
        this.f45140b = wwVar;
        this.f45141c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f45139a) {
            case 0:
                ww.v0(this.f45140b, this.f45141c, this.d);
                return;
            default:
                ww.j0(this.f45140b, this.f45141c, this.d);
                return;
        }
    }
}
