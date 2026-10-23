package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l81 implements RequestDelegate {
    public final int f38849a;
    public final p91 f38850b;

    public l81(p91 p91Var, int i10) {
        this.f38849a = i10;
        this.f38850b = p91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38849a) {
            case 0:
                p91.U(this.f38850b, tLObject);
                return;
            default:
                p91.V(this.f38850b, tLObject);
                return;
        }
    }
}
