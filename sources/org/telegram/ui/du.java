package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class du implements Runnable {
    public final int f45112a;
    public final ww f45113b;
    public final TLRPC.TL_attachMenuBot f45114c;
    public final LaunchActivity d;

    public du(ww wwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f45112a = i7;
        this.f45113b = wwVar;
        this.f45114c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f45112a) {
            case 0:
                ww.v0(this.f45113b, this.f45114c, this.d);
                return;
            default:
                ww.j0(this.f45113b, this.f45114c, this.d);
                return;
        }
    }
}
