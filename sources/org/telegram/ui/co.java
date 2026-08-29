package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class co implements RequestDelegate {
    public final int f37183a;
    public final ko f37184b;

    public co(ko koVar, int i10) {
        this.f37183a = i10;
        this.f37184b = koVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37183a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1(this.f37184b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fo(this.f37184b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fo(this.f37184b, 4));
                return;
        }
    }
}
