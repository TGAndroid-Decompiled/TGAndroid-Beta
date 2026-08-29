package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p81 implements RequestDelegate {
    public final int f41321a;
    public final t91 f41322b;

    public p81(t91 t91Var, int i10) {
        this.f41321a = i10;
        this.f41322b = t91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41321a) {
            case 0:
                t91.U(this.f41322b, tLObject);
                return;
            default:
                t91.V(this.f41322b, tLObject);
                return;
        }
    }
}
