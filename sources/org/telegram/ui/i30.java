package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i30 implements Utilities.Callback2 {
    public final int f37018a;
    public final n60 f37019b;

    public i30(n60 n60Var, int i10) {
        this.f37018a = i10;
        this.f37019b = n60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f37018a) {
            case 0:
                n60 n60Var = this.f37019b;
                if (updates != null) {
                    n60Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new z20(n60Var, 10));
                return;
            default:
                n60 n60Var2 = this.f37019b;
                if (updates != null) {
                    n60Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                } else {
                    n60Var2.getClass();
                    return;
                }
        }
    }
}
