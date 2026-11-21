package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ah implements Runnable {
    public final int f45627a = 1;
    public final bn f45628b;
    public final TLRPC.TL_attachMenuBot f45629c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f45630e;

    public ah(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f45628b = bnVar;
        this.f45629c = tL_attachMenuBot;
        this.d = tL_error;
        this.f45630e = user;
    }

    @Override
    public final void run() {
        switch (this.f45627a) {
            case 0:
                bn.j0(this.f45628b, this.f45629c, this.d, this.f45630e);
                return;
            default:
                bn.x0(this.f45628b, this.f45629c, this.d, this.f45630e);
                return;
        }
    }

    public ah(bn bnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f45628b = bnVar;
        this.d = tL_error;
        this.f45629c = tL_attachMenuBot;
        this.f45630e = user;
    }
}
