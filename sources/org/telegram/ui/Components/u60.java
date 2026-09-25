package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u60 implements RequestDelegate {
    public final int f28711a;
    public final w60 f28712b;

    public u60(w60 w60Var, int i10) {
        this.f28711a = i10;
        this.f28712b = w60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28711a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.f28712b, tL_error, tLObject, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vw(15, this.f28712b, tL_error));
                return;
        }
    }
}
