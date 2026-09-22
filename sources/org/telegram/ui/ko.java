package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ko implements RequestDelegate {
    public final int f35233a;
    public final uo f35234b;

    public ko(uo uoVar, int i10) {
        this.f35233a = i10;
        this.f35234b = uoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35233a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.f35234b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mo(this.f35234b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new mo(this.f35234b, 4));
                return;
        }
    }
}
