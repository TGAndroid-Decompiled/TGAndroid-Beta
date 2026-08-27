package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class l20 implements RequestDelegate {

    public final int f39921a;

    public final s50 f39922b;

    public l20(s50 s50Var, int i10) {
        this.f39921a = i10;
        this.f39922b = s50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39921a) {
            case 0:
                s50.v(this.f39922b, tLObject);
                break;
            default:
                s50.t(this.f39922b, tLObject);
                break;
        }
    }
}
