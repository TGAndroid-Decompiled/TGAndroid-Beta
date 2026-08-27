package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class m81 implements RequestDelegate {

    public final int f40398a;

    public final q91 f40399b;

    public m81(q91 q91Var, int i10) {
        this.f40398a = i10;
        this.f40399b = q91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40398a) {
            case 0:
                q91.U(this.f40399b, tLObject);
                break;
            default:
                q91.V(this.f40399b, tLObject);
                break;
        }
    }
}
