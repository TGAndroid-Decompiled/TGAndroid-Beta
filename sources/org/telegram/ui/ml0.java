package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ml0 implements RequestDelegate {
    public final int f39727a;
    public final sm0 f39728b;

    public ml0(sm0 sm0Var, int i10) {
        this.f39727a = i10;
        this.f39728b = sm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39727a) {
            case 0:
                org.telegram.messenger.i0.g3(new pl0(this.f39728b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new uf0(16, this.f39728b, tL_error));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new pl0(this.f39728b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.i0.g3(new tl0(this.f39728b, tL_error, tLObject, 0));
                return;
        }
    }
}
