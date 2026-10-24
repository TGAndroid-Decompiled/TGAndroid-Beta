package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Utilities.Callback {
    public final int f34914a;
    public final s9 f34915b;

    public n9(s9 s9Var, int i10) {
        this.f34914a = i10;
        this.f34915b = s9Var;
    }

    @Override
    public final void run(Object obj) {
        ei.e2 e2Var;
        switch (this.f34914a) {
            case 0:
                s9.Z(this.f34915b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                s9 s9Var = this.f34915b;
                if (!s9Var.isFinished && (e2Var = s9Var.M) != null) {
                    if (user == null) {
                        AndroidUtilities.runOnUIThread(new o9(s9Var, 1));
                        return;
                    }
                    AndroidUtilities.hideKeyboard(e2Var);
                    s9Var.h0(null, user);
                    return;
                }
                return;
        }
    }
}
