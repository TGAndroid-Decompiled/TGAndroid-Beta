package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nl0 implements RequestDelegate {
    public final int f39496a;
    public final xm0 f39497b;

    public nl0(xm0 xm0Var, int i10) {
        this.f39496a = i10;
        this.f39497b = xm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39496a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xe0(this.f39497b, tL_error, tLObject, 11));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new yg0(12, this.f39497b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jl0(this.f39497b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yg0(11, this.f39497b, tLObject));
                return;
        }
    }
}
