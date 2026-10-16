package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hd implements RequestDelegate {
    public final int f36520a;
    public final sd f36521b;

    public hd(sd sdVar, int i10) {
        this.f36520a = i10;
        this.f36521b = sdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36520a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jd(0, this.f36521b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new id(this.f36521b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.p0(28, this.f36521b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1(this.f36521b, tL_error, tLObject, 11));
                return;
        }
    }
}
