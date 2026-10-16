package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ac0 implements Utilities.Callback2 {
    public final int f33869a;
    public final ic0 f33870b;
    public final String f33871c;

    public ac0(ic0 ic0Var, String str, int i10) {
        this.f33869a = i10;
        this.f33870b = ic0Var;
        this.f33871c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f33869a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ic0 ic0Var = this.f33870b;
                ic0Var.c();
                if (passkeys != null) {
                    ic0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f33871c)) {
                        ic0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str = (String) obj2;
                ic0 ic0Var2 = this.f33870b;
                ic0Var2.c();
                if (z1Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.zc.b0(str);
                    return;
                }
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.e2.B(U.getContext(), ic0Var2.f36776b, z1Var, null, U.getResourceProvider(), null, new dc0(ic0Var2, this.f33871c, 1));
                    return;
                }
                return;
        }
    }
}
