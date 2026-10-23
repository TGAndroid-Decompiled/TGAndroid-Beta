package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n20 implements RequestDelegate {
    public final int f39746a;
    public final u50 f39747b;

    public n20(u50 u50Var, int i10) {
        this.f39746a = i10;
        this.f39747b = u50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39746a) {
            case 0:
                u50.v(this.f39747b, tLObject);
                return;
            default:
                u50.t(this.f39747b, tLObject);
                return;
        }
    }
}
