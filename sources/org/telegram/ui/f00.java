package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f00 implements RequestDelegate {
    public final int f33052a;
    public final c10 f33053b;

    public f00(c10 c10Var, int i10) {
        this.f33052a = i10;
        this.f33053b = c10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33052a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hw(10, this.f33053b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tq(this.f33053b, tL_error, tLObject, 6));
                return;
        }
    }
}
