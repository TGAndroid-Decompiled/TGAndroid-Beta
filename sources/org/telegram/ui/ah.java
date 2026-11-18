package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ah implements Runnable {
    public final int f45590a = 1;
    public final bn f45591b;
    public final TLRPC.TL_attachMenuBot f45592c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f45593e;

    public ah(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f45591b = bnVar;
        this.f45592c = tL_attachMenuBot;
        this.d = tL_error;
        this.f45593e = user;
    }

    @Override
    public final void run() {
        switch (this.f45590a) {
            case 0:
                bn.j0(this.f45591b, this.f45592c, this.d, this.f45593e);
                return;
            default:
                bn.x0(this.f45591b, this.f45592c, this.d, this.f45593e);
                return;
        }
    }

    public ah(bn bnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f45591b = bnVar;
        this.d = tL_error;
        this.f45592c = tL_attachMenuBot;
        this.f45593e = user;
    }
}
