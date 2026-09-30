package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x60 implements RequestDelegate {
    public final int f30125a;
    public final z60 f30126b;

    public x60(z60 z60Var, int i10) {
        this.f30125a = i10;
        this.f30126b = z60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30125a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.f30126b, tL_error, tLObject, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xw(15, this.f30126b, tL_error));
                return;
        }
    }
}
