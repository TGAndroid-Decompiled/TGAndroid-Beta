package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o70 implements RequestDelegate {
    public final int f29080a;
    public final q70 f29081b;

    public o70(q70 q70Var, int i10) {
        this.f29080a = i10;
        this.f29081b = q70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f29080a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h((Object) this.f29081b, (Object) tL_error, tLObject, 23));
                return;
            default:
                AndroidUtilities.runOnUIThread(new hu(19, this.f29081b, tL_error));
                return;
        }
    }
}
