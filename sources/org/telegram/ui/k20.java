package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k20 implements RequestDelegate {
    public final int f38402a;
    public final q50 f38403b;

    public k20(q50 q50Var, int i10) {
        this.f38402a = i10;
        this.f38403b = q50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38402a) {
            case 0:
                q50.w(this.f38403b, tLObject);
                return;
            default:
                q50.u(this.f38403b, tLObject);
                return;
        }
    }
}
