package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ko implements RequestDelegate {
    public final int f35215a;
    public final uo f35216b;

    public ko(uo uoVar, int i10) {
        this.f35215a = i10;
        this.f35216b = uoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35215a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.f35216b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mo(this.f35216b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new mo(this.f35216b, 4));
                return;
        }
    }
}
