package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f40670a = 0;
    public final un f40671b;
    public final TLRPC.TL_error f40672c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public ph(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f40671b = unVar;
        this.d = tL_attachMenuBot;
        this.f40672c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f40670a) {
            case 0:
                un.s1(this.f40671b, this.d, this.f40672c, this.e);
                return;
            default:
                un.o1(this.f40671b, this.d, this.f40672c, this.e);
                return;
        }
    }

    public ph(un unVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f40671b = unVar;
        this.f40672c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
