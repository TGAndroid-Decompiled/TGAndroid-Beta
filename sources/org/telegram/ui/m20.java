package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m20 implements RequestDelegate {
    public final int f38974a;
    public final s50 f38975b;

    public m20(s50 s50Var, int i10) {
        this.f38974a = i10;
        this.f38975b = s50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38974a) {
            case 0:
                s50.w(this.f38975b, tLObject);
                return;
            default:
                s50.t(this.f38975b, tLObject);
                return;
        }
    }
}
