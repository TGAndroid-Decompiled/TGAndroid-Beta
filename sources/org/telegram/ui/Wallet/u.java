package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class u implements x10 {
    public final int f43184a = 0;
    public final n0 f43185b;
    public final Object f43186c;
    public final Object d;
    public final Object f43187e;

    public u(n0 n0Var, c20 c20Var, byte[] bArr, k0 k0Var) {
        this.f43185b = n0Var;
        this.f43186c = c20Var;
        this.d = bArr;
        this.f43187e = k0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f43184a) {
            case 0:
                c20 c20Var = (c20) this.f43186c;
                byte[] bArr = (byte[]) this.d;
                k0 k0Var = (k0) this.f43187e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                n0 n0Var = this.f43185b;
                int i7 = n0Var.f42793a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        c20Var.a(str);
                        return;
                    }
                    n0Var.l0(walletState);
                    new r0(i7, n0.w(), n0Var.t()).p(p10.i(i7).e(), bArr, k0Var, c20Var);
                    n0Var.R();
                    return;
                }
                return;
            default:
                x9 x9Var = (x9) this.f43186c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f43187e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                c20 c20Var2 = (c20) obj3;
                String str4 = x9Var.f43342f;
                n0 n0Var2 = this.f43185b;
                if (!n0.b(str4, n0Var2.t())) {
                    c20Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    n0Var2.d0(user, str2, 0L, str3, null, x9Var.f43341e, null, new t(11, x9Var, c20Var2), null, null);
                    return;
                }
        }
    }

    public u(x9 x9Var, n0 n0Var, TLRPC.User user, String str) {
        this.f43186c = x9Var;
        this.f43185b = n0Var;
        this.d = user;
        this.f43187e = str;
    }
}
