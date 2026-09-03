package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jo implements RequestDelegate {
    public final int f35330a;
    public final ro f35331b;

    public jo(ro roVar, int i10) {
        this.f35330a = i10;
        this.f35331b = roVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35330a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1(this.f35331b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lo(this.f35331b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lo(this.f35331b, 4));
                return;
        }
    }
}
