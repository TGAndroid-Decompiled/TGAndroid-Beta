package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f37314a = 0;
    public final xn f37315b;
    public final TLRPC.TL_error f37316c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public ph(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f37315b = xnVar;
        this.d = tL_attachMenuBot;
        this.f37316c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f37314a) {
            case 0:
                xn.w1(this.f37315b, this.d, this.f37316c, this.e);
                return;
            default:
                xn.W(this.f37315b, this.d, this.f37316c, this.e);
                return;
        }
    }

    public ph(xn xnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f37315b = xnVar;
        this.f37316c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
