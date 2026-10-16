package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h30 implements RequestDelegate {
    public final int f36384a;
    public final n60 f36385b;

    public h30(n60 n60Var, int i10) {
        this.f36384a = i10;
        this.f36385b = n60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36384a) {
            case 0:
                n60.w(this.f36385b, tLObject);
                return;
            default:
                n60.u(this.f36385b, tLObject);
                return;
        }
    }
}
