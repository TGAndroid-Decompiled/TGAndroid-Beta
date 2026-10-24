package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nl0 implements RequestDelegate {
    public final int f39918a;
    public final zm0 f39919b;

    public nl0(zm0 zm0Var, int i10) {
        this.f39918a = i10;
        this.f39919b = zm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39918a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qe0(this.f39919b, tL_error, tLObject, 12));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ah0(12, this.f39919b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jl0(this.f39919b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ah0(11, this.f39919b, tLObject));
                return;
        }
    }
}
