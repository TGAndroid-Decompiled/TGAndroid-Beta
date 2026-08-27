package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class m20 implements Utilities.Callback2 {

    public final int f40299a;

    public final s50 f40300b;

    public m20(s50 s50Var, int i10) {
        this.f40299a = i10;
        this.f40300b = s50Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.f40299a) {
            case 0:
                s50 s50Var = this.f40300b;
                if (updates != null) {
                    s50Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new e20(s50Var, 10));
                break;
            default:
                s50 s50Var2 = this.f40300b;
                if (updates == null) {
                    s50Var2.getClass();
                } else {
                    s50Var2.d.getMessagesController().processUpdates(updates, false);
                }
                break;
        }
    }
}
