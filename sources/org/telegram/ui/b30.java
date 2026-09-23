package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b30 implements Utilities.Callback2 {
    public final int f31951a;
    public final f60 f31952b;

    public b30(f60 f60Var, int i10) {
        this.f31951a = i10;
        this.f31952b = f60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f31951a) {
            case 0:
                f60 f60Var = this.f31952b;
                if (updates != null) {
                    f60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new s20(f60Var, 10));
                return;
            default:
                f60 f60Var2 = this.f31952b;
                if (updates != null) {
                    f60Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    f60Var2.getClass();
                    return;
                }
        }
    }
}
