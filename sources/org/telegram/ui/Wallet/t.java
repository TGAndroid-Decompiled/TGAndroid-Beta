package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t implements x10 {
    public final int f43106a = 0;
    public final l0 f43107b;
    public final Object f43108c;
    public final Object d;
    public final Object f43109e;

    public t(l0 l0Var, c20 c20Var, byte[] bArr, i0 i0Var) {
        this.f43107b = l0Var;
        this.f43108c = c20Var;
        this.d = bArr;
        this.f43109e = i0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f43106a) {
            case 0:
                c20 c20Var = (c20) this.f43108c;
                byte[] bArr = (byte[]) this.d;
                i0 i0Var = (i0) this.f43109e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                l0 l0Var = this.f43107b;
                int i7 = l0Var.f42680a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        c20Var.a(str);
                        return;
                    }
                    l0Var.l0(walletState);
                    new p0(i7, l0.w(), l0Var.t()).p(p10.i(i7).e(), bArr, i0Var, c20Var);
                    l0Var.R();
                    return;
                }
                return;
            default:
                v9 v9Var = (v9) this.f43108c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f43109e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                c20 c20Var2 = (c20) obj3;
                String str4 = v9Var.f43228f;
                l0 l0Var2 = this.f43107b;
                if (!l0.b(str4, l0Var2.t())) {
                    c20Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    l0Var2.d0(user, str2, 0L, str3, null, v9Var.f43227e, null, new s(11, v9Var, c20Var2), null, null);
                    return;
                }
        }
    }

    public t(v9 v9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f43108c = v9Var;
        this.f43107b = l0Var;
        this.d = user;
        this.f43109e = str;
    }
}
