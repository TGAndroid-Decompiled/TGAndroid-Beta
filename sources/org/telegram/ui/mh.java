package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class mh implements Runnable {

    public final int f40507a = 0;

    public final rn f40508b;

    public final TLRPC.TL_error f40509c;
    public final TLRPC.TL_attachMenuBot d;

    public final TLRPC.User f40510e;

    public mh(rn rnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f40508b = rnVar;
        this.d = tL_attachMenuBot;
        this.f40509c = tL_error;
        this.f40510e = user;
    }

    @Override
    public final void run() {
        switch (this.f40507a) {
            case 0:
                rn.w1(this.f40508b, this.d, this.f40509c, this.f40510e);
                break;
            default:
                rn.W(this.f40508b, this.d, this.f40509c, this.f40510e);
                break;
        }
    }

    public mh(rn rnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f40508b = rnVar;
        this.f40509c = tL_error;
        this.d = tL_attachMenuBot;
        this.f40510e = user;
    }
}
