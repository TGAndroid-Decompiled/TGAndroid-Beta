package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h00 implements RequestDelegate {
    public final int f34088a;
    public final e10 f34089b;

    public h00(e10 e10Var, int i10) {
        this.f34088a = i10;
        this.f34089b = e10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34088a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tv(11, this.f34089b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tq(this.f34089b, tL_error, tLObject, 6));
                return;
        }
    }
}
