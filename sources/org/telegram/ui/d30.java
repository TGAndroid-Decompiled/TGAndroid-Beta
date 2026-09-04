package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d30 implements RequestDelegate {
    public final int f35639a;
    public final j60 f35640b;

    public d30(j60 j60Var, int i10) {
        this.f35639a = i10;
        this.f35640b = j60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35639a) {
            case 0:
                j60.u(this.f35640b, tLObject);
                return;
            default:
                j60.s(this.f35640b, tLObject);
                return;
        }
    }
}
