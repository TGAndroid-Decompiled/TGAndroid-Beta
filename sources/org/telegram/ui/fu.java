package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fu implements Runnable {
    public final int f47198a;
    public final yw f47199b;
    public final TLRPC.TL_attachMenuBot f47200c;
    public final LaunchActivity d;

    public fu(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f47198a = i7;
        this.f47199b = ywVar;
        this.f47200c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f47198a) {
            case 0:
                yw.v0(this.f47199b, this.f47200c, this.d);
                return;
            default:
                yw.j0(this.f47199b, this.f47200c, this.d);
                return;
        }
    }
}
