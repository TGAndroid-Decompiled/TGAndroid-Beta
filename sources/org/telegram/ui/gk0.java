package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gk0 implements RequestDelegate {
    public final int f48314a;
    public final kl0 f48315b;

    public gk0(kl0 kl0Var, int i7) {
        this.f48314a = i7;
        this.f48315b = kl0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48314a) {
            case 0:
                org.telegram.messenger.g0.g3(new jk0(this.f48315b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bd0(21, this.f48315b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new jk0(this.f48315b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.g0.g3(new ok0(this.f48315b, tL_error, tLObject, 0));
                return;
        }
    }
}
