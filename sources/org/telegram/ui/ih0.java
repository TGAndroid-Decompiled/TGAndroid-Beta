package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih0 implements RequestDelegate {
    public final int f33734a;
    public final zh0 f33735b;

    public ih0(zh0 zh0Var, int i10) {
        this.f33734a = i10;
        this.f33735b = zh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33734a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nh0(this.f33735b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h90(25, this.f33735b, tL_error));
                return;
        }
    }
}
