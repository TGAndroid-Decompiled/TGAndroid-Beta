package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pv implements Runnable {
    public final int f36781a;
    public final qy f36782b;
    public final TLRPC.TL_attachMenuBot f36783c;
    public final LaunchActivity d;

    public pv(qy qyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f36781a = i10;
        this.f36782b = qyVar;
        this.f36783c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f36781a) {
            case 0:
                qy.w0(this.f36782b, this.f36783c, this.d);
                return;
            default:
                qy.x0(this.f36782b, this.f36783c, this.d);
                return;
        }
    }
}
