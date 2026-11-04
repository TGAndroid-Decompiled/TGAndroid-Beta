package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class f90 implements org.telegram.messenger.n10 {
    public final int f45220a;
    public final m90 f45221b;
    public final String f45222c;

    public f90(m90 m90Var, String str, int i3) {
        this.f45220a = i3;
        this.f45221b = m90Var;
        this.f45222c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3 = this.f45220a;
        String str = this.f45222c;
        m90 m90Var = this.f45221b;
        switch (i3) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m90Var.c();
                if (passkeys != null) {
                    m90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        m90Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.x1 x1Var = (org.telegram.ui.Wallet.x1) obj;
                String str2 = (String) obj2;
                m90Var.c();
                if (x1Var == null) {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.bd.M0(2131743001, null);
                    }
                    org.telegram.ui.Components.fc.b0(str2);
                    return;
                }
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null && T.getContext() != null) {
                    org.telegram.ui.Wallet.c2.D(T.getContext(), m90Var.f47567b, x1Var, null, T.getResourceProvider(), null, new i90(m90Var, str, 1));
                    return;
                }
                return;
        }
    }
}
