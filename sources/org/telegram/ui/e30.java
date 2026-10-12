package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e30 implements Utilities.Callback2 {
    public final int f36966a;
    public final i60 f36967b;

    public e30(i60 i60Var, int i10) {
        this.f36966a = i10;
        this.f36967b = i60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f36966a) {
            case 0:
                i60 i60Var = this.f36967b;
                if (updates != null) {
                    i60Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new v20(i60Var, 10));
                return;
            default:
                i60 i60Var2 = this.f36967b;
                if (updates != null) {
                    i60Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                } else {
                    i60Var2.getClass();
                    return;
                }
        }
    }
}
