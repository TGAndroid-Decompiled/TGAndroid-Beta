package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f39867a = 0;
    public final tn f39868b;
    public final TLRPC.TL_error f39869c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f39870e;

    public kh(tn tnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f39868b = tnVar;
        this.d = tL_attachMenuBot;
        this.f39869c = tL_error;
        this.f39870e = user;
    }

    @Override
    public final void run() {
        switch (this.f39867a) {
            case 0:
                tn.w1(this.f39868b, this.d, this.f39869c, this.f39870e);
                return;
            default:
                tn.W(this.f39868b, this.d, this.f39869c, this.f39870e);
                return;
        }
    }

    public kh(tn tnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f39868b = tnVar;
        this.f39869c = tL_error;
        this.d = tL_attachMenuBot;
        this.f39870e = user;
    }
}
