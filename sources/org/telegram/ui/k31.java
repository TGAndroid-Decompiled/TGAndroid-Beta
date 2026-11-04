package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k31 implements RequestDelegate {
    public final int f46758a;
    public final r41 f46759b;

    public k31(r41 r41Var, int i3) {
        this.f46758a = i3;
        this.f46759b = r41Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46758a) {
            case 0:
                r41.a0(this.f46759b, tLObject);
                return;
            default:
                r41.Z(this.f46759b, tLObject);
                return;
        }
    }
}
