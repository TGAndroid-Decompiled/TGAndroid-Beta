package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o70 implements RequestDelegate {
    public final int f29084a;
    public final q70 f29085b;

    public o70(q70 q70Var, int i10) {
        this.f29084a = i10;
        this.f29085b = q70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f29084a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h((Object) this.f29085b, (Object) tL_error, tLObject, 23));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jt(20, this.f29085b, tL_error));
                return;
        }
    }
}
