package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oz implements RequestDelegate {
    public final int f40399a;
    public final i00 f40400b;

    public oz(i00 i00Var, int i10) {
        this.f40399a = i10;
        this.f40400b = i00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40399a) {
            case 0:
                org.telegram.messenger.i0.g3(new xs(16, this.f40400b, tLObject));
                return;
            default:
                org.telegram.messenger.i0.g3(new qq(this.f40400b, tL_error, tLObject, 6));
                return;
        }
    }
}
