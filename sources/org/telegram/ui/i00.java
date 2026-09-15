package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i00 implements RequestDelegate {
    public final int f34371a;
    public final f10 f34372b;

    public i00(f10 f10Var, int i10) {
        this.f34371a = i10;
        this.f34372b = f10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34371a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kw(10, this.f34372b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xq(this.f34372b, tL_error, tLObject, 6));
                return;
        }
    }
}
