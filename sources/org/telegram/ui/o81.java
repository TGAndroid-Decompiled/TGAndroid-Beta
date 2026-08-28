package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o81 implements RequestDelegate {
    public final int f41008a;
    public final s91 f41009b;

    public o81(s91 s91Var, int i9) {
        this.f41008a = i9;
        this.f41009b = s91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41008a) {
            case 0:
                s91.T(this.f41009b, tLObject);
                return;
            default:
                s91.U(this.f41009b, tLObject);
                return;
        }
    }
}
