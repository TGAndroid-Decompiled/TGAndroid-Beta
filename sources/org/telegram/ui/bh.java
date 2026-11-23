package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bh implements Runnable {
    public final int f46044a = 1;
    public final bn f46045b;
    public final TLRPC.TL_attachMenuBot f46046c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f46047e;

    public bh(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f46045b = bnVar;
        this.f46046c = tL_attachMenuBot;
        this.d = tL_error;
        this.f46047e = user;
    }

    @Override
    public final void run() {
        switch (this.f46044a) {
            case 0:
                bn.j0(this.f46045b, this.f46046c, this.d, this.f46047e);
                return;
            default:
                bn.x0(this.f46045b, this.f46046c, this.d, this.f46047e);
                return;
        }
    }

    public bh(bn bnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f46045b = bnVar;
        this.d = tL_error;
        this.f46046c = tL_attachMenuBot;
        this.f46047e = user;
    }
}
