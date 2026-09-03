package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nn0 implements RequestDelegate {
    public final int f39415a;
    public final lo0 f39416b;

    public nn0(lo0 lo0Var, int i10) {
        this.f39415a = i10;
        this.f39416b = lo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39415a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ue0(23, this.f39416b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mn0(this.f39416b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gn0(this.f39416b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gn0(this.f39416b, tLObject, 0));
                return;
        }
    }
}
