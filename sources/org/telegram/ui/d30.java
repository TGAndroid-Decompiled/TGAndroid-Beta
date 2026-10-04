package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d30 implements RequestDelegate {
    public final int f35635a;
    public final h60 f35636b;

    public d30(h60 h60Var, int i10) {
        this.f35635a = i10;
        this.f35636b = h60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35635a) {
            case 0:
                h60.u(this.f35636b, tLObject);
                return;
            default:
                h60.s(this.f35636b, tLObject);
                return;
        }
    }
}
