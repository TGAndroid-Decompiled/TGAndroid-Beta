package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a30 implements Utilities.Callback2 {
    public final int f32436a;
    public final e60 f32437b;

    public a30(e60 e60Var, int i10) {
        this.f32436a = i10;
        this.f32437b = e60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f32436a) {
            case 0:
                e60 e60Var = this.f32437b;
                if (updates != null) {
                    e60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new r20(e60Var, 10));
                return;
            default:
                e60 e60Var2 = this.f32437b;
                if (updates != null) {
                    e60Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    e60Var2.getClass();
                    return;
                }
        }
    }
}
