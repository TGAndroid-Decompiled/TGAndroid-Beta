package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l90 implements org.telegram.messenger.p10 {
    public final int f49655a;
    public final r90 f49656b;
    public final String f49657c;

    public l90(r90 r90Var, String str, int i7) {
        this.f49655a = i7;
        this.f49656b = r90Var;
        this.f49657c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f49655a;
        String str = this.f49657c;
        r90 r90Var = this.f49656b;
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
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj;
                String str2 = (String) obj2;
                r90Var.c();
                if (h2Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.gd.N0(2131742720, null);
                    }
                    org.telegram.ui.Components.kc.c0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.m2.D(T.getContext(), r90Var.f51668b, h2Var, null, T.getResourceProvider(), null, new k90(r90Var, str, 1));
                    return;
                }
                return;
        }
    }
}
