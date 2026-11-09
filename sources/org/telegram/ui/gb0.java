package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gb0 implements RequestDelegate {
    public final int f45951a;
    public final qb0 f45952b;
    public final String f45953c;

    public gb0(qb0 qb0Var, String str, int i7) {
        this.f45951a = i7;
        this.f45952b = qb0Var;
        this.f45953c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45951a) {
            case 0:
                org.telegram.messenger.g0.h3(new ib0(this.f45952b, tL_error, this.f45953c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new ib0(this.f45952b, tL_error, tLObject, this.f45953c));
                return;
        }
    }
}
