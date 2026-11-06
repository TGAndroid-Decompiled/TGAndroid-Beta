package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eb0 implements RequestDelegate {
    public final int f45254a;
    public final ob0 f45255b;
    public final String f45256c;

    public eb0(ob0 ob0Var, String str, int i7) {
        this.f45254a = i7;
        this.f45255b = ob0Var;
        this.f45256c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45254a) {
            case 0:
                org.telegram.messenger.g0.h3(new gb0(this.f45255b, tL_error, this.f45256c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new gb0(this.f45255b, tL_error, tLObject, this.f45256c));
                return;
        }
    }
}
