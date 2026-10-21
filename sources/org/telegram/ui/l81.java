package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l81 implements RequestDelegate {
    public final int f38845a;
    public final p91 f38846b;

    public l81(p91 p91Var, int i10) {
        this.f38845a = i10;
        this.f38846b = p91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38845a) {
            case 0:
                p91.U(this.f38846b, tLObject);
                return;
            default:
                p91.V(this.f38846b, tLObject);
                return;
        }
    }
}
