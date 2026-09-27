package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w60 implements RequestDelegate {
    public final int f29857a;
    public final y60 f29858b;

    public w60(y60 y60Var, int i10) {
        this.f29857a = i10;
        this.f29858b = y60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f29857a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.f29858b, tL_error, tLObject, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jy(12, this.f29858b, tL_error));
                return;
        }
    }
}
