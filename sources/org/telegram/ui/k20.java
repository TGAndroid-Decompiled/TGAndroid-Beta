package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k20 implements RequestDelegate {
    public final int f39734a;
    public final r50 f39735b;

    public k20(r50 r50Var, int i10) {
        this.f39734a = i10;
        this.f39735b = r50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39734a) {
            case 0:
                r50.u(this.f39735b, tLObject);
                return;
            default:
                r50.s(this.f39735b, tLObject);
                return;
        }
    }
}
