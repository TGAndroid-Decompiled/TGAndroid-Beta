package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c91 implements RequestDelegate {
    public final int f33233a;
    public final ga1 f33234b;

    public c91(ga1 ga1Var, int i10) {
        this.f33233a = i10;
        this.f33234b = ga1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33233a) {
            case 0:
                ga1.U(this.f33234b, tLObject);
                return;
            default:
                ga1.V(this.f33234b, tLObject);
                return;
        }
    }
}
