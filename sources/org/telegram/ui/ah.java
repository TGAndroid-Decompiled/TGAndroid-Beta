package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ah implements Runnable {
    public final int f45631a = 1;
    public final bn f45632b;
    public final TLRPC.TL_attachMenuBot f45633c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f45634e;

    public ah(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f45632b = bnVar;
        this.f45633c = tL_attachMenuBot;
        this.d = tL_error;
        this.f45634e = user;
    }

    @Override
    public final void run() {
        switch (this.f45631a) {
            case 0:
                bn.j0(this.f45632b, this.f45633c, this.d, this.f45634e);
                return;
            default:
                bn.x0(this.f45632b, this.f45633c, this.d, this.f45634e);
                return;
        }
    }

    public ah(bn bnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f45632b = bnVar;
        this.d = tL_error;
        this.f45633c = tL_attachMenuBot;
        this.f45634e = user;
    }
}
