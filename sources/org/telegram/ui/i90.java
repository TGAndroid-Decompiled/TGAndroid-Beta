package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class i90 implements org.telegram.messenger.v10 {
    public final int f46612a;
    public final p90 f46613b;
    public final String f46614c;

    public i90(p90 p90Var, String str, int i7) {
        this.f46612a = i7;
        this.f46613b = p90Var;
        this.f46614c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f46612a;
        String str = this.f46614c;
        p90 p90Var = this.f46613b;
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
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                String str2 = (String) obj2;
                p90Var.c();
                if (a2Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.hd.M0(2131742992, null);
                    }
                    org.telegram.ui.Components.hc.b0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.f2.D(T.getContext(), p90Var.f48718b, a2Var, null, T.getResourceProvider(), null, new l90(p90Var, str, 1));
                    return;
                }
                return;
        }
    }
}
