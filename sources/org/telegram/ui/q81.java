package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q81 implements RequestDelegate {
    public final int f40656a;
    public final u91 f40657b;

    public q81(u91 u91Var, int i10) {
        this.f40656a = i10;
        this.f40657b = u91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40656a) {
            case 0:
                u91.U(this.f40657b, tLObject);
                return;
            default:
                u91.V(this.f40657b, tLObject);
                return;
        }
    }
}
