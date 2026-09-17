package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f33095a;
    public final nd f33096b;

    public dd(nd ndVar, int i10) {
        this.f33095a = i10;
        this.f33096b = ndVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33095a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(17, this.f33096b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ed(this.f33096b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new l4(15, this.f33096b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.f33096b, tL_error, tLObject, 11));
                return;
        }
    }
}
