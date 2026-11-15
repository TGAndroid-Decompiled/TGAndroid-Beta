package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eb0 implements RequestDelegate {
    public final int f46663a;
    public final ob0 f46664b;
    public final String f46665c;

    public eb0(ob0 ob0Var, String str, int i7) {
        this.f46663a = i7;
        this.f46664b = ob0Var;
        this.f46665c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46663a) {
            case 0:
                org.telegram.messenger.g0.h3(new gb0(this.f46664b, tL_error, this.f46665c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new gb0(this.f46664b, tL_error, tLObject, this.f46665c));
                return;
        }
    }
}
