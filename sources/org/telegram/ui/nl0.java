package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nl0 implements RequestDelegate {
    public final int f39504a;
    public final xm0 f39505b;

    public nl0(xm0 xm0Var, int i10) {
        this.f39504a = i10;
        this.f39505b = xm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39504a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xe0(this.f39505b, tL_error, tLObject, 11));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zg0(12, this.f39505b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jl0(this.f39505b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zg0(11, this.f39505b, tLObject));
                return;
        }
    }
}
