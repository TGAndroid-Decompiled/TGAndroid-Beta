package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f38948a = 1;
    public final sn f38949b;
    public final TLRPC.TL_attachMenuBot f38950c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public kh(sn snVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f38949b = snVar;
        this.f38950c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f38948a) {
            case 0:
                sn.R0(this.f38949b, this.f38950c, this.d, this.e);
                return;
            default:
                sn.e1(this.f38949b, this.f38950c, this.d, this.e);
                return;
        }
    }

    public kh(sn snVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f38949b = snVar;
        this.d = tL_error;
        this.f38950c = tL_attachMenuBot;
        this.e = user;
    }
}
