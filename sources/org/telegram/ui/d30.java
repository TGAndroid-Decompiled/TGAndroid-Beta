package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d30 implements RequestDelegate {
    public final int f35627a;
    public final h60 f35628b;

    public d30(h60 h60Var, int i10) {
        this.f35627a = i10;
        this.f35628b = h60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35627a) {
            case 0:
                h60.u(this.f35628b, tLObject);
                return;
            default:
                h60.s(this.f35628b, tLObject);
                return;
        }
    }
}
