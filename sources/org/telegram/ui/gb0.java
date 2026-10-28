package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gb0 implements Utilities.Callback2 {
    public final int f39580a;
    public final ob0 f39581b;
    public final String f39582c;

    public gb0(ob0 ob0Var, String str, int i10) {
        this.f39580a = i10;
        this.f39581b = ob0Var;
        this.f39582c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f39580a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ob0 ob0Var = this.f39581b;
                ob0Var.c();
                if (passkeys != null) {
                    ob0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f39582c)) {
                        ob0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str = (String) obj2;
                ob0 ob0Var2 = this.f39581b;
                ob0Var2.c();
                if (z1Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.wc.c0(str);
                    return;
                }
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.e2.B(U.getContext(), ob0Var2.f42051b, z1Var, null, U.getResourceProvider(), null, new jb0(ob0Var2, this.f39582c, 1));
                    return;
                }
                return;
        }
    }
}
