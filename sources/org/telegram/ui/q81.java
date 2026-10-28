package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q81 implements RequestDelegate {
    public final int f42635a;
    public final y91 f42636b;

    public q81(y91 y91Var, int i10) {
        this.f42635a = i10;
        this.f42636b = y91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42635a) {
            case 0:
                y91.W(this.f42636b, tLObject);
                return;
            default:
                y91.V(this.f42636b, tLObject);
                return;
        }
    }
}
