package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nn0 implements RequestDelegate {
    public final int f36044a;
    public final no0 f36045b;

    public nn0(no0 no0Var, int i10) {
        this.f36044a = i10;
        this.f36045b = no0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36044a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sj0(12, this.f36045b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mn0(this.f36045b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gn0(this.f36045b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gn0(this.f36045b, tLObject, 0));
                return;
        }
    }
}
