package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o81 implements RequestDelegate {
    public final int f42123a;
    public final w91 f42124b;

    public o81(w91 w91Var, int i10) {
        this.f42123a = i10;
        this.f42124b = w91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42123a) {
            case 0:
                w91.W(this.f42124b, tLObject);
                return;
            default:
                w91.V(this.f42124b, tLObject);
                return;
        }
    }
}
