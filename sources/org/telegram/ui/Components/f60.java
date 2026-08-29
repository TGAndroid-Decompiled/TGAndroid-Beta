package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f60 implements RequestDelegate {
    public final int f28326a;
    public final h60 f28327b;

    public f60(h60 h60Var, int i10) {
        this.f28326a = i10;
        this.f28327b = h60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28326a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g(this.f28327b, tL_error, tLObject, 13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gt(19, this.f28327b, tL_error));
                return;
        }
    }
}
