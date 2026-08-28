package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class en0 implements RequestDelegate {
    public final int f37996a;
    public final co0 f37997b;

    public en0(co0 co0Var, int i9) {
        this.f37996a = i9;
        this.f37997b = co0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37996a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cf0(19, this.f37997b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new dn0(this.f37997b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xm0(this.f37997b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xm0(this.f37997b, tLObject, 0));
                return;
        }
    }
}
