package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l51 implements RequestDelegate {
    public final int f39083a;
    public final s61 f39084b;

    public l51(s61 s61Var, int i10) {
        this.f39083a = i10;
        this.f39084b = s61Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39083a) {
            case 0:
                s61.a0(this.f39084b, tLObject);
                return;
            default:
                s61.Z(this.f39084b, tLObject);
                return;
        }
    }
}
