package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l90 implements org.telegram.messenger.q10 {
    public final int f49504a;
    public final r90 f49505b;
    public final String f49506c;

    public l90(r90 r90Var, String str, int i7) {
        this.f49504a = i7;
        this.f49505b = r90Var;
        this.f49506c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f49504a;
        String str = this.f49506c;
        r90 r90Var = this.f49505b;
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
                org.telegram.ui.Wallet.g2 g2Var = (org.telegram.ui.Wallet.g2) obj;
                String str2 = (String) obj2;
                r90Var.c();
                if (g2Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.gd.M0(2131742733, null);
                    }
                    org.telegram.ui.Components.lc.c0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.l2.D(T.getContext(), r90Var.f51541b, g2Var, null, T.getResourceProvider(), null, new k90(r90Var, str, 1));
                    return;
                }
                return;
        }
    }
}
