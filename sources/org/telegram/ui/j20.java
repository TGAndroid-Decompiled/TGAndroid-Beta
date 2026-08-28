package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j20 implements Utilities.Callback2 {
    public final int f39346a;
    public final o50 f39347b;

    public j20(o50 o50Var, int i9) {
        this.f39346a = i9;
        this.f39347b = o50Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f39346a) {
            case 0:
                o50 o50Var = this.f39347b;
                if (updates != null) {
                    o50Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new b20(o50Var, 10));
                return;
            default:
                o50 o50Var2 = this.f39347b;
                if (updates != null) {
                    o50Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    o50Var2.getClass();
                    return;
                }
        }
    }
}
