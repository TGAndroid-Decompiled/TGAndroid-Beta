package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nn0 implements RequestDelegate {
    public final int f36543a;
    public final lo0 f36544b;

    public nn0(lo0 lo0Var, int i10) {
        this.f36543a = i10;
        this.f36544b = lo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36543a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ie0(24, this.f36544b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mn0(this.f36544b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gn0(this.f36544b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gn0(this.f36544b, tLObject, 0));
                return;
        }
    }
}
