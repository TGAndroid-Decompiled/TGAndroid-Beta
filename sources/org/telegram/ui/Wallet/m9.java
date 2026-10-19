package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Utilities.Callback {
    public final int f34533a;
    public final r9 f34534b;

    public m9(r9 r9Var, int i10) {
        this.f34533a = i10;
        this.f34534b = r9Var;
    }

    @Override
    public final void run(Object obj) {
        ei.e2 e2Var;
        switch (this.f34533a) {
            case 0:
                r9.Z(this.f34534b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                r9 r9Var = this.f34534b;
                if (!r9Var.isFinished && (e2Var = r9Var.M) != null) {
                    if (user == null) {
                        AndroidUtilities.runOnUIThread(new n9(r9Var, 1));
                        return;
                    }
                    AndroidUtilities.hideKeyboard(e2Var);
                    r9Var.h0(null, user);
                    return;
                }
                return;
        }
    }
}
