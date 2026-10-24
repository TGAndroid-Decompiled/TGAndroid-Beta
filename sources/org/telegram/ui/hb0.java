package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hb0 implements Utilities.Callback2 {
    public final int f37802a;
    public final ob0 f37803b;
    public final String f37804c;

    public hb0(ob0 ob0Var, String str, int i10) {
        this.f37802a = i10;
        this.f37803b = ob0Var;
        this.f37804c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f37802a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ob0 ob0Var = this.f37803b;
                ob0Var.c();
                if (passkeys != null) {
                    ob0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f37804c)) {
                        ob0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str = (String) obj2;
                ob0 ob0Var2 = this.f37803b;
                ob0Var2.c();
                if (z1Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.vc.b0(str);
                    return;
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.e2.B(U.getContext(), ob0Var2.f40146b, z1Var, null, U.getResourceProvider(), null, new kb0(ob0Var2, this.f37804c, 1));
                    return;
                }
                return;
        }
    }
}
