package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m20 implements Utilities.Callback2 {
    public final int f40353a;
    public final r50 f40354b;

    public m20(r50 r50Var, int i10) {
        this.f40353a = i10;
        this.f40354b = r50Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f40353a) {
            case 0:
                r50 r50Var = this.f40354b;
                if (updates != null) {
                    r50Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new d20(r50Var, 10));
                return;
            default:
                r50 r50Var2 = this.f40354b;
                if (updates != null) {
                    r50Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    r50Var2.getClass();
                    return;
                }
        }
    }
}
