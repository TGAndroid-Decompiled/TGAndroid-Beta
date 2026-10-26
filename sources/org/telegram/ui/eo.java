package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eo implements RequestDelegate {
    public final int f39151a;
    public final mo f39152b;

    public eo(mo moVar, int i10) {
        this.f39151a = i10;
        this.f39152b = moVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39151a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.f39152b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new go(this.f39152b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new go(this.f39152b, 4));
                return;
        }
    }
}
