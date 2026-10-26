package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p20 implements RequestDelegate {
    public final int f42336a;
    public final v50 f42337b;

    public p20(v50 v50Var, int i10) {
        this.f42336a = i10;
        this.f42337b = v50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42336a) {
            case 0:
                v50.u(this.f42337b, tLObject);
                return;
            default:
                v50.s(this.f42337b, tLObject);
                return;
        }
    }
}
