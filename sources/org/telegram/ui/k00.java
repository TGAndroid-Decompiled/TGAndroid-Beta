package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k00 implements RequestDelegate {
    public final int f34965a;
    public final h10 f34966b;

    public k00(h10 h10Var, int i10) {
        this.f34965a = i10;
        this.f34966b = h10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34965a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mw(10, this.f34966b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xq(this.f34966b, tL_error, tLObject, 6));
                return;
        }
    }
}
