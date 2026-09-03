package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l60 implements RequestDelegate {
    public final int f26600a;
    public final n60 f26601b;

    public l60(n60 n60Var, int i10) {
        this.f26600a = i10;
        this.f26601b = n60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26600a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gp((Object) this.f26601b, (Object) tL_error, tLObject, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new em(27, this.f26601b, tL_error));
                return;
        }
    }
}
