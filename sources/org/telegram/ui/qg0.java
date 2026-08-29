package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qg0 implements RequestDelegate {
    public final int f41720a;
    public final hh0 f41721b;

    public qg0(hh0 hh0Var, int i10) {
        this.f41720a = i10;
        this.f41721b = hh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41720a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vg0(this.f41721b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lf0(1, this.f41721b, tL_error));
                return;
        }
    }
}
