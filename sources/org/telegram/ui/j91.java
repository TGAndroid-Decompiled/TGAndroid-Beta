package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j91 implements RequestDelegate {
    public final int f37887a;
    public final na1 f37888b;

    public j91(na1 na1Var, int i10) {
        this.f37887a = i10;
        this.f37888b = na1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37887a) {
            case 0:
                na1.U(this.f37888b, tLObject);
                return;
            default:
                na1.V(this.f37888b, tLObject);
                return;
        }
    }
}
