package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d91 implements RequestDelegate {
    public final int f36147a;
    public final ha1 f36148b;

    public d91(ha1 ha1Var, int i10) {
        this.f36147a = i10;
        this.f36148b = ha1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36147a) {
            case 0:
                ha1.U(this.f36148b, tLObject);
                return;
            default:
                ha1.V(this.f36148b, tLObject);
                return;
        }
    }
}
