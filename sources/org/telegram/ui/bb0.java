package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bb0 implements Utilities.Callback2 {
    public final int f35566a;
    public final ib0 f35567b;
    public final String f35568c;

    public bb0(ib0 ib0Var, String str, int i10) {
        this.f35566a = i10;
        this.f35567b = ib0Var;
        this.f35568c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f35566a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ib0 ib0Var = this.f35567b;
                ib0Var.c();
                if (passkeys != null) {
                    ib0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f35568c)) {
                        ib0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                String str = (String) obj2;
                ib0 ib0Var2 = this.f35567b;
                ib0Var2.c();
                if (a2Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.xc.b0(str);
                    return;
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.f2.B(U.getContext(), ib0Var2.f37916b, a2Var, null, U.getResourceProvider(), null, new eb0(ib0Var2, this.f35568c, 1));
                    return;
                }
                return;
        }
    }
}
