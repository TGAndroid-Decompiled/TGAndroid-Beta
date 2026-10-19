package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l81 implements RequestDelegate {
    public final int f38840a;
    public final p91 f38841b;

    public l81(p91 p91Var, int i10) {
        this.f38840a = i10;
        this.f38841b = p91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38840a) {
            case 0:
                p91.U(this.f38841b, tLObject);
                return;
            default:
                p91.V(this.f38841b, tLObject);
                return;
        }
    }
}
