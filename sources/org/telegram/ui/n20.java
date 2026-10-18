package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n20 implements Utilities.Callback2 {
    public final int f39322a;
    public final s50 f39323b;

    public n20(s50 s50Var, int i10) {
        this.f39322a = i10;
        this.f39323b = s50Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f39322a) {
            case 0:
                s50 s50Var = this.f39323b;
                if (updates != null) {
                    s50Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new e20(s50Var, 10));
                return;
            default:
                s50 s50Var2 = this.f39323b;
                if (updates != null) {
                    s50Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                } else {
                    s50Var2.getClass();
                    return;
                }
        }
    }
}
