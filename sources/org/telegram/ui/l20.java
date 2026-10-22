package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l20 implements Utilities.Callback2 {
    public final int f38729a;
    public final q50 f38730b;

    public l20(q50 q50Var, int i10) {
        this.f38729a = i10;
        this.f38730b = q50Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f38729a) {
            case 0:
                q50 q50Var = this.f38730b;
                if (updates != null) {
                    q50Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new c20(q50Var, 10));
                return;
            default:
                q50 q50Var2 = this.f38730b;
                if (updates != null) {
                    q50Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                } else {
                    q50Var2.getClass();
                    return;
                }
        }
    }
}
