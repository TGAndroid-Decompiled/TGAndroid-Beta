package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id implements RequestDelegate {
    public final int f37097a;
    public final sd f37098b;

    public id(sd sdVar, int i10) {
        this.f37097a = i10;
        this.f37098b = sdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37097a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fc(5, this.f37098b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new jd(this.f37098b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fc(3, this.f37098b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1(this.f37098b, tL_error, tLObject, 11));
                return;
        }
    }
}
