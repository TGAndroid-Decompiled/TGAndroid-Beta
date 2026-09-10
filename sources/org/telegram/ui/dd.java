package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f31885a;
    public final nd f31886b;

    public dd(nd ndVar, int i10) {
        this.f31885a = i10;
        this.f31886b = ndVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f31885a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n(20, this.f31886b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ed(this.f31886b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new n(18, this.f31886b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1(this.f31886b, tL_error, tLObject, 11));
                return;
        }
    }
}
