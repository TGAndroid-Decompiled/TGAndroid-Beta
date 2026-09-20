package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements RequestDelegate {
    public final int f34928a;
    public final ai0 f34929b;

    public jh0(ai0 ai0Var, int i10) {
        this.f34928a = i10;
        this.f34929b = ai0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34928a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oh0(this.f34929b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r80(28, this.f34929b, tL_error));
                return;
        }
    }
}
