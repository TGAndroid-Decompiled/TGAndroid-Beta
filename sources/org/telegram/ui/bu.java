package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bu implements Runnable {
    public final int f44144a;
    public final uw f44145b;
    public final TLRPC.TL_attachMenuBot f44146c;
    public final LaunchActivity d;

    public bu(uw uwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i3) {
        this.f44144a = i3;
        this.f44145b = uwVar;
        this.f44146c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f44144a) {
            case 0:
                uw.v0(this.f44145b, this.f44146c, this.d);
                return;
            default:
                uw.j0(this.f44145b, this.f44146c, this.d);
                return;
        }
    }
}
