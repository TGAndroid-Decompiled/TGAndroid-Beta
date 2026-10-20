package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f38607a = 1;
    public final qn f38608b;
    public final TLRPC.TL_attachMenuBot f38609c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public kh(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f38608b = qnVar;
        this.f38609c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f38607a) {
            case 0:
                qn.N0(this.f38608b, this.f38609c, this.d, this.e);
                return;
            default:
                qn.Z0(this.f38608b, this.f38609c, this.d, this.e);
                return;
        }
    }

    public kh(qn qnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f38608b = qnVar;
        this.d = tL_error;
        this.f38609c = tL_attachMenuBot;
        this.e = user;
    }
}
