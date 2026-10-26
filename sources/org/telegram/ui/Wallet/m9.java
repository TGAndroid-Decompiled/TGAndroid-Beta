package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Utilities.Callback {
    public final int f36973a;
    public final r9 f36974b;

    public m9(r9 r9Var, int i10) {
        this.f36973a = i10;
        this.f36974b = r9Var;
    }

    @Override
    public final void run(Object obj) {
        fi.c2 c2Var;
        switch (this.f36973a) {
            case 0:
                r9.a0(this.f36974b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                r9 r9Var = this.f36974b;
                if (!r9Var.isFinished && (c2Var = r9Var.N) != null) {
                    if (user == null) {
                        AndroidUtilities.runOnUIThread(new n9(r9Var, 1));
                        return;
                    }
                    AndroidUtilities.hideKeyboard(c2Var);
                    r9Var.i0(null, user);
                    return;
                }
                return;
        }
    }
}
