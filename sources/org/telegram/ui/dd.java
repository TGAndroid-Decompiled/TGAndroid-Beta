package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f33592a;
    public final nd f33593b;

    public dd(nd ndVar, int i10) {
        this.f33592a = i10;
        this.f33593b = ndVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33592a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yb(5, this.f33593b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ed(this.f33593b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new yb(3, this.f33593b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1(this.f33593b, tL_error, tLObject, 11));
                return;
        }
    }
}
