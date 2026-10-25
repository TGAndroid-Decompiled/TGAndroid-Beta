package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p20 implements RequestDelegate {
    public final int f42333a;
    public final v50 f42334b;

    public p20(v50 v50Var, int i10) {
        this.f42333a = i10;
        this.f42334b = v50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42333a) {
            case 0:
                v50.u(this.f42334b, tLObject);
                return;
            default:
                v50.s(this.f42334b, tLObject);
                return;
        }
    }
}
