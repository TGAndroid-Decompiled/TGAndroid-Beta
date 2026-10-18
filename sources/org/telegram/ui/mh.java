package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mh implements Runnable {
    public final int f39171a = 1;
    public final sn f39172b;
    public final TLRPC.TL_attachMenuBot f39173c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public mh(sn snVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f39172b = snVar;
        this.f39173c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f39171a) {
            case 0:
                sn.N0(this.f39172b, this.f39173c, this.d, this.e);
                return;
            default:
                sn.Z0(this.f39172b, this.f39173c, this.d, this.e);
                return;
        }
    }

    public mh(sn snVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f39172b = snVar;
        this.d = tL_error;
        this.f39173c = tL_attachMenuBot;
        this.e = user;
    }
}
