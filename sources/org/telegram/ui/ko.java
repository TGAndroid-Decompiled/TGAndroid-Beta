package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ko implements RequestDelegate {
    public final int f39321a;
    public final uo f39322b;

    public ko(uo uoVar, int i10) {
        this.f39321a = i10;
        this.f39322b = uoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39321a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.f39322b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mo(this.f39322b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new mo(this.f39322b, 4));
                return;
        }
    }
}
