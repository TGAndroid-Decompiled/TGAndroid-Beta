package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fb0 implements RequestDelegate {
    public final int f47588a;
    public final pb0 f47589b;
    public final String f47590c;

    public fb0(pb0 pb0Var, String str, int i7) {
        this.f47588a = i7;
        this.f47589b = pb0Var;
        this.f47590c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47588a) {
            case 0:
                org.telegram.messenger.g0.g3(new hb0(this.f47589b, tL_error, this.f47590c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new hb0(this.f47589b, tL_error, tLObject, this.f47590c));
                return;
        }
    }
}
