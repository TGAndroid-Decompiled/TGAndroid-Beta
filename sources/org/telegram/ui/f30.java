package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f30 implements RequestDelegate {
    public final int f33525a;
    public final k60 f33526b;

    public f30(k60 k60Var, int i10) {
        this.f33525a = i10;
        this.f33526b = k60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33525a) {
            case 0:
                k60.u(this.f33526b, tLObject);
                return;
            default:
                k60.s(this.f33526b, tLObject);
                return;
        }
    }
}
