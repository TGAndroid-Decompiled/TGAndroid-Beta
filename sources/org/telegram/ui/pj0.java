package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj0 implements RequestDelegate {
    public final int f42563a;
    public final xj0 f42564b;

    public pj0(xj0 xj0Var, int i10) {
        this.f42563a = i10;
        this.f42564b = xj0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42563a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wb0(22, this.f42564b, tLObject));
                return;
            default:
                boolean z10 = tLObject instanceof TLRPC.Updates;
                xj0 xj0Var = this.f42564b;
                if (z10) {
                    xj0Var.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    xj0Var.getClass();
                    return;
                }
        }
    }
}
