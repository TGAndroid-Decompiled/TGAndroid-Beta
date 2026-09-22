package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements RequestDelegate {
    public final int f34953a;
    public final ai0 f34954b;

    public jh0(ai0 ai0Var, int i10) {
        this.f34953a = i10;
        this.f34954b = ai0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34953a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oh0(this.f34954b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r80(28, this.f34954b, tL_error));
                return;
        }
    }
}
