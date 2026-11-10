package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l90 implements org.telegram.messenger.v10 {
    public final int f47551a;
    public final s90 f47552b;
    public final String f47553c;

    public l90(s90 s90Var, String str, int i7) {
        this.f47551a = i7;
        this.f47552b = s90Var;
        this.f47553c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f47551a;
        String str = this.f47553c;
        s90 s90Var = this.f47552b;
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
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                String str2 = (String) obj2;
                s90Var.c();
                if (y1Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.id.M0(2131742991, null);
                    }
                    org.telegram.ui.Components.gc.b0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.d2.D(T.getContext(), s90Var.f49757b, y1Var, null, T.getResourceProvider(), null, new o90(s90Var, str, 1));
                    return;
                }
                return;
        }
    }
}
