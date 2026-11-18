package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ah implements Runnable {
    public final int f45594a = 1;
    public final bn f45595b;
    public final TLRPC.TL_attachMenuBot f45596c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f45597e;

    public ah(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f45595b = bnVar;
        this.f45596c = tL_attachMenuBot;
        this.d = tL_error;
        this.f45597e = user;
    }

    @Override
    public final void run() {
        switch (this.f45594a) {
            case 0:
                bn.j0(this.f45595b, this.f45596c, this.d, this.f45597e);
                return;
            default:
                bn.x0(this.f45595b, this.f45596c, this.d, this.f45597e);
                return;
        }
    }

    public ah(bn bnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f45595b = bnVar;
        this.d = tL_error;
        this.f45596c = tL_attachMenuBot;
        this.f45597e = user;
    }
}
