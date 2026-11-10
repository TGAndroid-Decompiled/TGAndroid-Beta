package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gu implements Runnable {
    public final int f46156a;
    public final zw f46157b;
    public final TLRPC.TL_attachMenuBot f46158c;
    public final LaunchActivity d;

    public gu(zw zwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f46156a = i7;
        this.f46157b = zwVar;
        this.f46158c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f46156a) {
            case 0:
                zw.v0(this.f46157b, this.f46158c, this.d);
                return;
            default:
                zw.j0(this.f46157b, this.f46158c, this.d);
                return;
        }
    }
}
