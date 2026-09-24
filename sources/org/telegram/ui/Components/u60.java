package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u60 implements RequestDelegate {
    public final int f28697a;
    public final w60 f28698b;

    public u60(w60 w60Var, int i10) {
        this.f28697a = i10;
        this.f28698b = w60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28697a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.f28698b, tL_error, tLObject, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cv(16, this.f28698b, tL_error));
                return;
        }
    }
}
