package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f36163a;
    public final nd f36164b;

    public dd(nd ndVar, int i10) {
        this.f36163a = i10;
        this.f36164b = ndVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36163a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xc(3, this.f36164b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ed(this.f36164b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xc(1, this.f36164b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1(this.f36164b, tL_error, tLObject, 11));
                return;
        }
    }
}
