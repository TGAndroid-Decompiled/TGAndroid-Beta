package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r60 implements RequestDelegate {
    public final int f27784a;
    public final t60 f27785b;

    public r60(t60 t60Var, int i10) {
        this.f27784a = i10;
        this.f27785b = t60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27784a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.f27785b, tL_error, tLObject, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bv(16, this.f27785b, tL_error));
                return;
        }
    }
}
