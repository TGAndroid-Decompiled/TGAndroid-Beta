package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class na0 implements org.telegram.messenger.j20 {
    public final int f39888a;
    public final ua0 f39889b;
    public final String f39890c;

    public na0(ua0 ua0Var, String str, int i10) {
        this.f39888a = i10;
        this.f39889b = ua0Var;
        this.f39890c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f39888a;
        String str = this.f39890c;
        ua0 ua0Var = this.f39889b;
        switch (i10) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ua0Var.c();
                if (passkeys != null) {
                    ua0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        ua0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str2 = (String) obj2;
                ua0Var.c();
                if (z1Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.cd.L0(2131743017, null);
                    }
                    org.telegram.ui.Components.cc.b0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.e2.D(T.getContext(), ua0Var.f42101b, z1Var, null, T.getResourceProvider(), null, new qa0(ua0Var, str, 1));
                    return;
                }
                return;
        }
    }
}
