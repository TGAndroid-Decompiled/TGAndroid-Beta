package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d30 implements RequestDelegate {
    public final int f36634a;
    public final i60 f36635b;

    public d30(i60 i60Var, int i10) {
        this.f36634a = i10;
        this.f36635b = i60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36634a) {
            case 0:
                i60.w(this.f36635b, tLObject);
                return;
            default:
                i60.u(this.f36635b, tLObject);
                return;
        }
    }
}
