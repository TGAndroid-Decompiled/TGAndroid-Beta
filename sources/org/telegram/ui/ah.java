package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ah implements Runnable {
    public final int f45045a = 1;
    public final an f45046b;
    public final TLRPC.TL_attachMenuBot f45047c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f45048e;

    public ah(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f45046b = anVar;
        this.f45047c = tL_attachMenuBot;
        this.d = tL_error;
        this.f45048e = user;
    }

    @Override
    public final void run() {
        switch (this.f45045a) {
            case 0:
                an.j0(this.f45046b, this.f45047c, this.d, this.f45048e);
                return;
            default:
                an.x0(this.f45046b, this.f45047c, this.d, this.f45048e);
                return;
        }
    }

    public ah(an anVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f45046b = anVar;
        this.d = tL_error;
        this.f45047c = tL_attachMenuBot;
        this.f45048e = user;
    }
}
