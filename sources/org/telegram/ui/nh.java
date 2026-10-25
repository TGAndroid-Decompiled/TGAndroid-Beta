package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nh implements Runnable {
    public final int f41892a = 1;
    public final un f41893b;
    public final TLRPC.TL_attachMenuBot f41894c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public nh(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f41893b = unVar;
        this.f41894c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f41892a) {
            case 0:
                un.l0(this.f41893b, this.f41894c, this.d, this.e);
                return;
            default:
                un.r0(this.f41893b, this.f41894c, this.d, this.e);
                return;
        }
    }

    public nh(un unVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f41893b = unVar;
        this.d = tL_error;
        this.f41894c = tL_attachMenuBot;
        this.e = user;
    }
}
