package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f40039a = 0;
    public final xn f40040b;
    public final TLRPC.TL_error f40041c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f40042e;

    public ph(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f40040b = xnVar;
        this.d = tL_attachMenuBot;
        this.f40041c = tL_error;
        this.f40042e = user;
    }

    @Override
    public final void run() {
        switch (this.f40039a) {
            case 0:
                xn.w1(this.f40040b, this.d, this.f40041c, this.f40042e);
                return;
            default:
                xn.W(this.f40040b, this.d, this.f40041c, this.f40042e);
                return;
        }
    }

    public ph(xn xnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f40040b = xnVar;
        this.f40041c = tL_error;
        this.d = tL_attachMenuBot;
        this.f40042e = user;
    }
}
