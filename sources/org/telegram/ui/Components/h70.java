package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h70 implements RequestDelegate {
    public final int f25196a;
    public final j70 f25197b;

    public h70(j70 j70Var, int i10) {
        this.f25196a = i10;
        this.f25197b = j70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25196a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this.f25197b, tL_error, tLObject, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vm(28, this.f25197b, tL_error));
                return;
        }
    }
}
