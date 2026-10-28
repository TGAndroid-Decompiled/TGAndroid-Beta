package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class go implements RequestDelegate {
    public final int f39661a;
    public final oo f39662b;

    public go(oo ooVar, int i10) {
        this.f39661a = i10;
        this.f39662b = ooVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39661a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.f39662b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new io(this.f39662b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new io(this.f39662b, 4));
                return;
        }
    }
}
