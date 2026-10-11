package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c30 implements Utilities.Callback2 {
    public final int f36567a;
    public final g60 f36568b;

    public c30(g60 g60Var, int i10) {
        this.f36567a = i10;
        this.f36568b = g60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f36567a) {
            case 0:
                g60 g60Var = this.f36568b;
                if (updates != null) {
                    g60Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new s20(g60Var, 10));
                return;
            default:
                g60 g60Var2 = this.f36568b;
                if (updates != null) {
                    g60Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                } else {
                    g60Var2.getClass();
                    return;
                }
        }
    }
}
