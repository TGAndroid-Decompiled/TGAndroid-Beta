package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh implements RequestDelegate {
    public final int f39703a;
    public final un f39704b;
    public final TLRPC.TL_attachMenuBot f39705c;
    public final TLRPC.User d;

    public mh(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f39703a = i10;
        this.f39704b = unVar;
        this.f39705c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39703a) {
            case 0:
                org.telegram.messenger.i0.g3(new ph(this.f39704b, tL_error, this.f39705c, this.d));
                return;
            default:
                org.telegram.messenger.i0.g3(new ph(this.f39704b, this.f39705c, tL_error, this.d));
                return;
        }
    }
}
