package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pv implements Runnable {
    public final int f36682a;
    public final qy f36683b;
    public final TLRPC.TL_attachMenuBot f36684c;
    public final LaunchActivity d;

    public pv(qy qyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f36682a = i10;
        this.f36683b = qyVar;
        this.f36684c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f36682a) {
            case 0:
                qy.w0(this.f36683b, this.f36684c, this.d);
                return;
            default:
                qy.x0(this.f36683b, this.f36684c, this.d);
                return;
        }
    }
}
