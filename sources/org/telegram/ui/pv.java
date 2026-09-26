package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pv implements Runnable {
    public final int f36681a;
    public final qy f36682b;
    public final TLRPC.TL_attachMenuBot f36683c;
    public final LaunchActivity d;

    public pv(qy qyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f36681a = i10;
        this.f36682b = qyVar;
        this.f36683c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f36681a) {
            case 0:
                qy.w0(this.f36682b, this.f36683c, this.d);
                return;
            default:
                qy.x0(this.f36682b, this.f36683c, this.d);
                return;
        }
    }
}
