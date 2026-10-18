package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class db0 implements Utilities.Callback2 {
    public final int f36119a;
    public final kb0 f36120b;
    public final String f36121c;

    public db0(kb0 kb0Var, String str, int i10) {
        this.f36119a = i10;
        this.f36120b = kb0Var;
        this.f36121c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f36119a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                kb0 kb0Var = this.f36120b;
                kb0Var.c();
                if (passkeys != null) {
                    kb0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f36121c)) {
                        kb0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                String str = (String) obj2;
                kb0 kb0Var2 = this.f36120b;
                kb0Var2.c();
                if (a2Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.xc.b0(str);
                    return;
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.f2.B(U.getContext(), kb0Var2.f38455b, a2Var, null, U.getResourceProvider(), null, new gb0(kb0Var2, this.f36121c, 1));
                    return;
                }
                return;
        }
    }
}
