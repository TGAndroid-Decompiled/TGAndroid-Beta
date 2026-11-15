package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class j90 implements org.telegram.messenger.s10 {
    public final int f48264a;
    public final q90 f48265b;
    public final String f48266c;

    public j90(q90 q90Var, String str, int i7) {
        this.f48264a = i7;
        this.f48265b = q90Var;
        this.f48266c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f48264a;
        String str = this.f48266c;
        q90 q90Var = this.f48265b;
        switch (i7) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                q90Var.c();
                if (passkeys != null) {
                    q90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        q90Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                String str2 = (String) obj2;
                q90Var.c();
                if (y1Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.hd.M0(2131742991, null);
                    }
                    org.telegram.ui.Components.cc.b0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.d2.D(T.getContext(), q90Var.f50502b, y1Var, null, T.getResourceProvider(), null, new m90(q90Var, str, 1));
                    return;
                }
                return;
        }
    }
}
