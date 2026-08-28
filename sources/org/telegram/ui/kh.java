package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f39837a = 0;
    public final qn f39838b;
    public final TLRPC.TL_error f39839c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f39840e;

    public kh(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f39838b = qnVar;
        this.d = tL_attachMenuBot;
        this.f39839c = tL_error;
        this.f39840e = user;
    }

    @Override
    public final void run() {
        switch (this.f39837a) {
            case 0:
                qn.w1(this.f39838b, this.d, this.f39839c, this.f39840e);
                return;
            default:
                qn.V(this.f39838b, this.d, this.f39839c, this.f39840e);
                return;
        }
    }

    public kh(qn qnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f39838b = qnVar;
        this.f39839c = tL_error;
        this.d = tL_attachMenuBot;
        this.f39840e = user;
    }
}
