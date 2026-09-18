package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g30 implements Utilities.Callback2 {
    public final int f33830a;
    public final k60 f33831b;

    public g30(k60 k60Var, int i10) {
        this.f33830a = i10;
        this.f33831b = k60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f33830a) {
            case 0:
                k60 k60Var = this.f33831b;
                if (updates != null) {
                    k60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new x20(k60Var, 10));
                return;
            default:
                k60 k60Var2 = this.f33831b;
                if (updates != null) {
                    k60Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    k60Var2.getClass();
                    return;
                }
        }
    }
}
