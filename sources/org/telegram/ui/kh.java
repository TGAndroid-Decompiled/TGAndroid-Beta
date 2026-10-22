package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f38611a = 1;
    public final qn f38612b;
    public final TLRPC.TL_attachMenuBot f38613c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public kh(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f38612b = qnVar;
        this.f38613c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f38611a) {
            case 0:
                qn.N0(this.f38612b, this.f38613c, this.d, this.e);
                return;
            default:
                qn.Z0(this.f38612b, this.f38613c, this.d, this.e);
                return;
        }
    }

    public kh(qn qnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f38612b = qnVar;
        this.d = tL_error;
        this.f38613c = tL_attachMenuBot;
        this.e = user;
    }
}
