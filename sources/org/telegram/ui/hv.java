package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hv implements Runnable {
    public final int f37971a;
    public final ey f37972b;
    public final TLRPC.TL_attachMenuBot f37973c;
    public final LaunchActivity d;

    public hv(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37971a = i10;
        this.f37972b = eyVar;
        this.f37973c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37971a) {
            case 0:
                ey.r0(this.f37972b, this.f37973c, this.d);
                return;
            default:
                ey.f0(this.f37972b, this.f37973c, this.d);
                return;
        }
    }
}
