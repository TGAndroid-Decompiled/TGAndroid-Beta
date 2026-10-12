package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements RequestDelegate {
    public final int f39211a;
    public final ai0 f39212b;

    public jh0(ai0 ai0Var, int i10) {
        this.f39211a = i10;
        this.f39212b = ai0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39211a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oh0(this.f39212b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new og0(2, this.f39212b, tL_error));
                return;
        }
    }
}
