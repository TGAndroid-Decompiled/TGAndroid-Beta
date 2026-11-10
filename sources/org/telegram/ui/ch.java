package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ch implements Runnable {
    public final int f44353a = 1;
    public final cn f44354b;
    public final TLRPC.TL_attachMenuBot f44355c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f44356e;

    public ch(cn cnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f44354b = cnVar;
        this.f44355c = tL_attachMenuBot;
        this.d = tL_error;
        this.f44356e = user;
    }

    @Override
    public final void run() {
        switch (this.f44353a) {
            case 0:
                cn.j0(this.f44354b, this.f44355c, this.d, this.f44356e);
                return;
            default:
                cn.x0(this.f44354b, this.f44355c, this.d, this.f44356e);
                return;
        }
    }

    public ch(cn cnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f44354b = cnVar;
        this.d = tL_error;
        this.f44355c = tL_attachMenuBot;
        this.f44356e = user;
    }
}
