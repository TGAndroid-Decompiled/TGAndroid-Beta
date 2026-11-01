package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ma0 implements org.telegram.messenger.k20 {
    public final int f39489a;
    public final ta0 f39490b;
    public final String f39491c;

    public ma0(ta0 ta0Var, String str, int i10) {
        this.f39489a = i10;
        this.f39490b = ta0Var;
        this.f39491c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f39489a;
        String str = this.f39491c;
        ta0 ta0Var = this.f39490b;
        switch (i10) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ta0Var.c();
                if (passkeys != null) {
                    ta0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        ta0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str2 = (String) obj2;
                ta0Var.c();
                if (z1Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.dd.L0(2131743017, null);
                    }
                    org.telegram.ui.Components.cc.b0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.e2.D(T.getContext(), ta0Var.f41598b, z1Var, null, T.getResourceProvider(), null, new pa0(ta0Var, str, 1));
                    return;
                }
                return;
        }
    }
}
