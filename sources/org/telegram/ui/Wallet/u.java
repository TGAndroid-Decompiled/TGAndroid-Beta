package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class u implements x10 {
    public final int f43188a = 0;
    public final m0 f43189b;
    public final Object f43190c;
    public final Object d;
    public final Object f43191e;

    public u(m0 m0Var, c20 c20Var, byte[] bArr, j0 j0Var) {
        this.f43189b = m0Var;
        this.f43190c = c20Var;
        this.d = bArr;
        this.f43191e = j0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f43188a) {
            case 0:
                c20 c20Var = (c20) this.f43190c;
                byte[] bArr = (byte[]) this.d;
                j0 j0Var = (j0) this.f43191e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                m0 m0Var = this.f43189b;
                int i7 = m0Var.f42762a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        c20Var.a(str);
                        return;
                    }
                    m0Var.l0(walletState);
                    new q0(i7, m0.w(), m0Var.t()).p(p10.i(i7).e(), bArr, j0Var, c20Var);
                    m0Var.R();
                    return;
                }
                return;
            default:
                w9 w9Var = (w9) this.f43190c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f43191e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                c20 c20Var2 = (c20) obj3;
                String str4 = w9Var.f43310f;
                m0 m0Var2 = this.f43189b;
                if (!m0.b(str4, m0Var2.t())) {
                    c20Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    m0Var2.d0(user, str2, 0L, str3, null, w9Var.f43309e, null, new t(11, w9Var, c20Var2), null, null);
                    return;
                }
        }
    }

    public u(w9 w9Var, m0 m0Var, TLRPC.User user, String str) {
        this.f43190c = w9Var;
        this.f43189b = m0Var;
        this.d = user;
        this.f43191e = str;
    }
}
