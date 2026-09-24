package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ho implements RequestDelegate {
    public final int f34250a;
    public final ro f34251b;

    public ho(ro roVar, int i10) {
        this.f34250a = i10;
        this.f34251b = roVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34250a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.f34251b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jo(this.f34251b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jo(this.f34251b, 4));
                return;
        }
    }
}
