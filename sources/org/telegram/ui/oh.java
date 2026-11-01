package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh implements RequestDelegate {
    public final int f40162a;
    public final un f40163b;
    public final TLRPC.TL_attachMenuBot f40164c;
    public final TLRPC.User d;

    public oh(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40162a = i10;
        this.f40163b = unVar;
        this.f40164c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40162a) {
            case 0:
                org.telegram.messenger.i0.g3(new ph(this.f40163b, tL_error, this.f40164c, this.d));
                return;
            default:
                org.telegram.messenger.i0.g3(new ph(this.f40163b, this.f40164c, tL_error, this.d));
                return;
        }
    }
}
