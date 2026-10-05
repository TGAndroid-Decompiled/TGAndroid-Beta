package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jo implements RequestDelegate {
    public final int f37742a;
    public final to f37743b;

    public jo(to toVar, int i10) {
        this.f37742a = i10;
        this.f37743b = toVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37742a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.f37743b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lo(this.f37743b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lo(this.f37743b, 4));
                return;
        }
    }
}
