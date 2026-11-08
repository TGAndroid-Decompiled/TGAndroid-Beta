package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class i90 implements org.telegram.messenger.v10 {
    public final int f46609a;
    public final p90 f46610b;
    public final String f46611c;

    public i90(p90 p90Var, String str, int i7) {
        this.f46609a = i7;
        this.f46610b = p90Var;
        this.f46611c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f46609a;
        String str = this.f46611c;
        p90 p90Var = this.f46610b;
        switch (i7) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                p90Var.c();
                if (passkeys != null) {
                    p90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        p90Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str2 = (String) obj2;
                p90Var.c();
                if (z1Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.id.M0(2131742994, null);
                    }
                    org.telegram.ui.Components.hc.b0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.e2.D(T.getContext(), p90Var.f48712b, z1Var, null, T.getResourceProvider(), null, new l90(p90Var, str, 1));
                    return;
                }
                return;
        }
    }
}
