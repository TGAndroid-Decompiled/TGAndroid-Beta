package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nh implements Runnable {
    public final int f41805a = 0;
    public final wn f41806b;
    public final TLRPC.TL_error f41807c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public nh(wn wnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f41806b = wnVar;
        this.d = tL_attachMenuBot;
        this.f41807c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f41805a) {
            case 0:
                wn.R0(this.f41806b, this.d, this.f41807c, this.e);
                return;
            default:
                wn.O0(this.f41806b, this.d, this.f41807c, this.e);
                return;
        }
    }

    public nh(wn wnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f41806b = wnVar;
        this.f41807c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
