package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a50 implements RequestDelegate {
    public final int f31727a;
    public final c50 f31728b;

    public a50(c50 c50Var, int i3) {
        this.f31727a = i3;
        this.f31728b = c50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f31727a) {
            case 0:
                org.telegram.messenger.g0.h3(new e7((Object) this.f31728b, (Object) tL_error, (Object) tLObject, 13));
                return;
            default:
                org.telegram.messenger.g0.h3(new cl(29, this.f31728b, tL_error));
                return;
        }
    }
}
