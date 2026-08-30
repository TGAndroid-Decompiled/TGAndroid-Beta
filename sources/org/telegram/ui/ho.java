package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ho implements RequestDelegate {
    public final int f34923a;
    public final po f34924b;

    public ho(po poVar, int i10) {
        this.f34923a = i10;
        this.f34924b = poVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34923a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(this.f34924b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jo(this.f34924b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jo(this.f34924b, 4));
                return;
        }
    }
}
