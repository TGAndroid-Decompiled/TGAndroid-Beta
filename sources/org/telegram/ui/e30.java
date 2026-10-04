package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e30 implements Utilities.Callback2 {
    public final int f35896a;
    public final h60 f35897b;

    public e30(h60 h60Var, int i10) {
        this.f35896a = i10;
        this.f35897b = h60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f35896a) {
            case 0:
                h60 h60Var = this.f35897b;
                if (updates != null) {
                    h60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new v20(h60Var, 10));
                return;
            default:
                h60 h60Var2 = this.f35897b;
                if (updates != null) {
                    h60Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    h60Var2.getClass();
                    return;
                }
        }
    }
}
