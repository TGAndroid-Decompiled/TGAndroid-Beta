package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o20 implements Utilities.Callback2 {
    public final int f40052a;
    public final u50 f40053b;

    public o20(u50 u50Var, int i10) {
        this.f40052a = i10;
        this.f40053b = u50Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f40052a) {
            case 0:
                u50 u50Var = this.f40053b;
                if (updates != null) {
                    u50Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new f20(u50Var, 10));
                return;
            default:
                u50 u50Var2 = this.f40053b;
                if (updates != null) {
                    u50Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                } else {
                    u50Var2.getClass();
                    return;
                }
        }
    }
}
