package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class m90 implements org.telegram.messenger.q10 {
    public final int f49775a;
    public final s90 f49776b;
    public final String f49777c;

    public m90(s90 s90Var, String str, int i7) {
        this.f49775a = i7;
        this.f49776b = s90Var;
        this.f49777c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f49775a;
        String str = this.f49777c;
        s90 s90Var = this.f49776b;
        switch (i7) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                s90Var.c();
                if (passkeys != null) {
                    s90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        s90Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.g2 g2Var = (org.telegram.ui.Wallet.g2) obj;
                String str2 = (String) obj2;
                s90Var.c();
                if (g2Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.gd.M0(2131742733, null);
                    }
                    org.telegram.ui.Components.lc.c0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.l2.D(T.getContext(), s90Var.f51935b, g2Var, null, T.getResourceProvider(), null, new l90(s90Var, str, 1));
                    return;
                }
                return;
        }
    }
}
