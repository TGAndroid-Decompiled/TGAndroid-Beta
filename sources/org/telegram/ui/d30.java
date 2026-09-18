package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d30 implements RequestDelegate {
    public final int f32845a;
    public final i60 f32846b;

    public d30(i60 i60Var, int i10) {
        this.f32845a = i10;
        this.f32846b = i60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32845a) {
            case 0:
                i60.u(this.f32846b, tLObject);
                return;
            default:
                i60.s(this.f32846b, tLObject);
                return;
        }
    }
}
