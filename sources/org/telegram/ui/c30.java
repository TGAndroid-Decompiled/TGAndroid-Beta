package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c30 implements Utilities.Callback2 {
    public final int f32511a;
    public final g60 f32512b;

    public c30(g60 g60Var, int i10) {
        this.f32511a = i10;
        this.f32512b = g60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f32511a) {
            case 0:
                g60 g60Var = this.f32512b;
                if (updates != null) {
                    g60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new t20(g60Var, 10));
                return;
            default:
                g60 g60Var2 = this.f32512b;
                if (updates != null) {
                    g60Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    g60Var2.getClass();
                    return;
                }
        }
    }
}
