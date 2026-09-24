package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pv implements Runnable {
    public final int f36666a;
    public final qy f36667b;
    public final TLRPC.TL_attachMenuBot f36668c;
    public final LaunchActivity d;

    public pv(qy qyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f36666a = i10;
        this.f36667b = qyVar;
        this.f36668c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f36666a) {
            case 0:
                qy.w0(this.f36667b, this.f36668c, this.d);
                return;
            default:
                qy.x0(this.f36667b, this.f36668c, this.d);
                return;
        }
    }
}
