package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f40483a = 0;
    public final un f40484b;
    public final TLRPC.TL_error f40485c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public ph(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f40484b = unVar;
        this.d = tL_attachMenuBot;
        this.f40485c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f40483a) {
            case 0:
                un.p0(this.f40484b, this.d, this.f40485c, this.e);
                return;
            default:
                un.j0(this.f40484b, this.d, this.f40485c, this.e);
                return;
        }
    }

    public ph(un unVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f40484b = unVar;
        this.f40485c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
