package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fb0 implements RequestDelegate {
    public final int f47657a;
    public final pb0 f47658b;
    public final String f47659c;

    public fb0(pb0 pb0Var, String str, int i7) {
        this.f47657a = i7;
        this.f47658b = pb0Var;
        this.f47659c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47657a) {
            case 0:
                org.telegram.messenger.g0.g3(new hb0(this.f47658b, tL_error, this.f47659c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new hb0(this.f47658b, tL_error, tLObject, this.f47659c));
                return;
        }
    }
}
