package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n91 implements RequestDelegate {
    public final int f35461a;
    public final ra1 f35462b;

    public n91(ra1 ra1Var, int i10) {
        this.f35461a = i10;
        this.f35462b = ra1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35461a) {
            case 0:
                ra1.U(this.f35462b, tLObject);
                return;
            default:
                ra1.V(this.f35462b, tLObject);
                return;
        }
    }
}
