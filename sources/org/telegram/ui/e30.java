package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e30 implements RequestDelegate {
    public final int f32045a;
    public final j60 f32046b;

    public e30(j60 j60Var, int i10) {
        this.f32045a = i10;
        this.f32046b = j60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32045a) {
            case 0:
                j60.u(this.f32046b, tLObject);
                return;
            default:
                j60.s(this.f32046b, tLObject);
                return;
        }
    }
}
