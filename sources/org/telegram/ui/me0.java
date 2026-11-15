package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class me0 implements RequestDelegate {
    public final int f49216a;
    public final cf0 f49217b;

    public me0(cf0 cf0Var, int i7) {
        this.f49216a = i7;
        this.f49217b = cf0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49216a) {
            case 0:
                org.telegram.messenger.g0.h3(new re0(this.f49217b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new jd0(4, this.f49217b, tL_error));
                return;
        }
    }
}
