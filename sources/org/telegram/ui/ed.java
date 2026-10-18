package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ed implements RequestDelegate {
    public final int f36464a;
    public final od f36465b;

    public ed(od odVar, int i10) {
        this.f36464a = i10;
        this.f36465b = odVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36464a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i0(19, this.f36465b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new fd(this.f36465b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i0(17, this.f36465b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1(this.f36465b, tL_error, tLObject, 11));
                return;
        }
    }
}
