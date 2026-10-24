package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p81 implements RequestDelegate {
    public final int f40390a;
    public final t91 f40391b;

    public p81(t91 t91Var, int i10) {
        this.f40390a = i10;
        this.f40391b = t91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40390a) {
            case 0:
                t91.U(this.f40391b, tLObject);
                return;
            default:
                t91.V(this.f40391b, tLObject);
                return;
        }
    }
}
