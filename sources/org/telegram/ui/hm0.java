package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hm0 implements RequestDelegate {
    public final int f36614a;
    public final sn0 f36615b;

    public hm0(sn0 sn0Var, int i10) {
        this.f36614a = i10;
        this.f36615b = sn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36614a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tf0(this.f36615b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new se0(24, this.f36615b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new cm0(this.f36615b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new se0(23, this.f36615b, tLObject));
                return;
        }
    }
}
