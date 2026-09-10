package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s60 implements RequestDelegate {
    public final int f26957a;
    public final u60 f26958b;

    public s60(u60 u60Var, int i10) {
        this.f26957a = i10;
        this.f26958b = u60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26957a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gf(this.f26958b, tL_error, tLObject, 11));
                return;
            default:
                AndroidUtilities.runOnUIThread(new hy(13, this.f26958b, tL_error));
                return;
        }
    }
}
