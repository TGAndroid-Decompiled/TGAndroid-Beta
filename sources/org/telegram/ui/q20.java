package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q20 implements Utilities.Callback2 {
    public final int f42713a;
    public final v50 f42714b;

    public q20(v50 v50Var, int i10) {
        this.f42713a = i10;
        this.f42714b = v50Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f42713a) {
            case 0:
                v50 v50Var = this.f42714b;
                if (updates != null) {
                    v50Var.d.getMessagesController().lambda$processUpdates$379(updates, false);
                }
                AndroidUtilities.runOnUIThread(new h20(v50Var, 10));
                return;
            default:
                v50 v50Var2 = this.f42714b;
                if (updates != null) {
                    v50Var2.d.getMessagesController().lambda$processUpdates$379(updates, false);
                    return;
                } else {
                    v50Var2.getClass();
                    return;
                }
        }
    }
}
