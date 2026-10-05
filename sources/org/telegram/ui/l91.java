package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l91 implements RequestDelegate {
    public final int f38260a;
    public final ta1 f38261b;

    public l91(ta1 ta1Var, int i10) {
        this.f38260a = i10;
        this.f38261b = ta1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38260a) {
            case 0:
                ta1.T(this.f38261b, tLObject);
                return;
            default:
                ta1.S(this.f38261b, tLObject);
                return;
        }
    }
}
