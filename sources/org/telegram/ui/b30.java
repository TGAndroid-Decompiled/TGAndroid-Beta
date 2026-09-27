package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b30 implements RequestDelegate {
    public final int f32225a;
    public final g60 f32226b;

    public b30(g60 g60Var, int i10) {
        this.f32225a = i10;
        this.f32226b = g60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32225a) {
            case 0:
                g60.u(this.f32226b, tLObject);
                return;
            default:
                g60.s(this.f32226b, tLObject);
                return;
        }
    }
}
