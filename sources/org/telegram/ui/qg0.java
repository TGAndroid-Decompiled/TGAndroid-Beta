package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qg0 implements RequestDelegate {
    public final int f41793a;
    public final hh0 f41794b;

    public qg0(hh0 hh0Var, int i9) {
        this.f41793a = i9;
        this.f41794b = hh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41793a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vg0(this.f41794b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cf0(4, this.f41794b, tL_error));
                return;
        }
    }
}
