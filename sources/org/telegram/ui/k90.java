package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k90 implements org.telegram.messenger.v10 {
    public final int f47242a;
    public final r90 f47243b;
    public final String f47244c;

    public k90(r90 r90Var, String str, int i7) {
        this.f47242a = i7;
        this.f47243b = r90Var;
        this.f47244c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f47242a;
        String str = this.f47244c;
        r90 r90Var = this.f47243b;
        switch (i7) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                r90Var.c();
                if (passkeys != null) {
                    r90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        r90Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                String str2 = (String) obj2;
                r90Var.c();
                if (y1Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.id.M0(2131742991, null);
                    }
                    org.telegram.ui.Components.hc.b0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.d2.D(T.getContext(), r90Var.f49348b, y1Var, null, T.getResourceProvider(), null, new n90(r90Var, str, 1));
                    return;
                }
                return;
        }
    }
}
