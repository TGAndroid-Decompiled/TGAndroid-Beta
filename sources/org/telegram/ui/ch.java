package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ch implements Runnable {
    public final int f44308a = 1;
    public final cn f44309b;
    public final TLRPC.TL_attachMenuBot f44310c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f44311e;

    public ch(cn cnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f44309b = cnVar;
        this.f44310c = tL_attachMenuBot;
        this.d = tL_error;
        this.f44311e = user;
    }

    @Override
    public final void run() {
        switch (this.f44308a) {
            case 0:
                cn.j0(this.f44309b, this.f44310c, this.d, this.f44311e);
                return;
            default:
                cn.x0(this.f44309b, this.f44310c, this.d, this.f44311e);
                return;
        }
    }

    public ch(cn cnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f44309b = cnVar;
        this.d = tL_error;
        this.f44310c = tL_attachMenuBot;
        this.f44311e = user;
    }
}
