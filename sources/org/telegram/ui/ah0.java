package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ah0 implements RequestDelegate {
    public final int f32589a;
    public final rh0 f32590b;

    public ah0(rh0 rh0Var, int i10) {
        this.f32589a = i10;
        this.f32590b = rh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32589a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fh0(this.f32590b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ie0(9, this.f32590b, tL_error));
                return;
        }
    }
}
