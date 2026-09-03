package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f40015a = 0;
    public final xn f40016b;
    public final TLRPC.TL_error f40017c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f40018e;

    public ph(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f40016b = xnVar;
        this.d = tL_attachMenuBot;
        this.f40017c = tL_error;
        this.f40018e = user;
    }

    @Override
    public final void run() {
        switch (this.f40015a) {
            case 0:
                xn.w1(this.f40016b, this.d, this.f40017c, this.f40018e);
                return;
            default:
                xn.W(this.f40016b, this.d, this.f40017c, this.f40018e);
                return;
        }
    }

    public ph(xn xnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f40016b = xnVar;
        this.f40017c = tL_error;
        this.d = tL_attachMenuBot;
        this.f40018e = user;
    }
}
