package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k91 implements RequestDelegate {
    public final int f35452a;
    public final oa1 f35453b;

    public k91(oa1 oa1Var, int i10) {
        this.f35452a = i10;
        this.f35453b = oa1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35452a) {
            case 0:
                oa1.U(this.f35453b, tLObject);
                return;
            default:
                oa1.V(this.f35453b, tLObject);
                return;
        }
    }
}
