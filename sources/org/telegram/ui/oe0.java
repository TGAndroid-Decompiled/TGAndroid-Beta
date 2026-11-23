package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe0 implements RequestDelegate {
    public final int f50672a;
    public final ef0 f50673b;

    public oe0(ef0 ef0Var, int i7) {
        this.f50672a = i7;
        this.f50673b = ef0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50672a) {
            case 0:
                org.telegram.messenger.g0.g3(new te0(this.f50673b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new bd0(5, this.f50673b, tL_error));
                return;
        }
    }
}
