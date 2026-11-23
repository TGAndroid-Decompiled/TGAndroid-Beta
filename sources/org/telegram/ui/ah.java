package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ah implements Runnable {
    public final int f45598a = 1;
    public final bn f45599b;
    public final TLRPC.TL_attachMenuBot f45600c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f45601e;

    public ah(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f45599b = bnVar;
        this.f45600c = tL_attachMenuBot;
        this.d = tL_error;
        this.f45601e = user;
    }

    @Override
    public final void run() {
        switch (this.f45598a) {
            case 0:
                bn.j0(this.f45599b, this.f45600c, this.d, this.f45601e);
                return;
            default:
                bn.x0(this.f45599b, this.f45600c, this.d, this.f45601e);
                return;
        }
    }

    public ah(bn bnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f45599b = bnVar;
        this.d = tL_error;
        this.f45600c = tL_attachMenuBot;
        this.f45601e = user;
    }
}
