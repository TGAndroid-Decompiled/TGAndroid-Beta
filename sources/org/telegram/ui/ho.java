package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ho implements RequestDelegate {
    public final int f34264a;
    public final ro f34265b;

    public ho(ro roVar, int i10) {
        this.f34264a = i10;
        this.f34265b = roVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34264a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.f34265b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jo(this.f34265b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jo(this.f34265b, 4));
                return;
        }
    }
}
