package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k00 implements RequestDelegate {
    public final int f34182a;
    public final h10 f34183b;

    public k00(h10 h10Var, int i10) {
        this.f34182a = i10;
        this.f34183b = h10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34182a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uv(13, this.f34183b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zq(this.f34183b, tL_error, tLObject, 6));
                return;
        }
    }
}
