package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e30 implements Utilities.Callback2 {
    public final int f35941a;
    public final j60 f35942b;

    public e30(j60 j60Var, int i10) {
        this.f35941a = i10;
        this.f35942b = j60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f35941a) {
            case 0:
                j60 j60Var = this.f35942b;
                if (updates != null) {
                    j60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new v20(j60Var, 10));
                return;
            default:
                j60 j60Var2 = this.f35942b;
                if (updates != null) {
                    j60Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    j60Var2.getClass();
                    return;
                }
        }
    }
}
