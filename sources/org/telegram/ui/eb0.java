package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eb0 implements Utilities.Callback2 {
    public final int f39071a;
    public final lb0 f39072b;
    public final String f39073c;

    public eb0(lb0 lb0Var, String str, int i10) {
        this.f39071a = i10;
        this.f39072b = lb0Var;
        this.f39073c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f39071a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                lb0 lb0Var = this.f39072b;
                lb0Var.c();
                if (passkeys != null) {
                    lb0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f39073c)) {
                        lb0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str = (String) obj2;
                lb0 lb0Var2 = this.f39072b;
                lb0Var2.c();
                if (z1Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.wc.c0(str);
                    return;
                }
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.e2.B(U.getContext(), lb0Var2.f41236b, z1Var, null, U.getResourceProvider(), null, new hb0(lb0Var2, this.f39073c, 1));
                    return;
                }
                return;
        }
    }
}
