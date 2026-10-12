package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bc0 implements Utilities.Callback2 {
    public final int f34510a;
    public final jc0 f34511b;
    public final String f34512c;

    public bc0(jc0 jc0Var, String str, int i10) {
        this.f34510a = i10;
        this.f34511b = jc0Var;
        this.f34512c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34510a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                jc0 jc0Var = this.f34511b;
                jc0Var.c();
                if (passkeys != null) {
                    jc0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f34512c)) {
                        jc0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                String str = (String) obj2;
                jc0 jc0Var2 = this.f34511b;
                jc0Var2.c();
                if (y1Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.zc.b0(str);
                    return;
                }
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.d2.B(U.getContext(), jc0Var2.f37344b, y1Var, null, U.getResourceProvider(), null, new ec0(jc0Var2, this.f34512c, 1));
                    return;
                }
                return;
        }
    }
}
