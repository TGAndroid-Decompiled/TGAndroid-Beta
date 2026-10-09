package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l70 implements RequestDelegate {
    public final int f28318a;
    public final n70 f28319b;

    public l70(n70 n70Var, int i10) {
        this.f28318a = i10;
        this.f28319b = n70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28318a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this.f28319b, tL_error, tLObject, 24));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zr(22, this.f28319b, tL_error));
                return;
        }
    }
}
