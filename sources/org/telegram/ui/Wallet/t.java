package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t implements x10 {
    public final int f43172a = 0;
    public final l0 f43173b;
    public final Object f43174c;
    public final Object d;
    public final Object f43175e;

    public t(l0 l0Var, c20 c20Var, byte[] bArr, i0 i0Var) {
        this.f43173b = l0Var;
        this.f43174c = c20Var;
        this.d = bArr;
        this.f43175e = i0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f43172a) {
            case 0:
                c20 c20Var = (c20) this.f43174c;
                byte[] bArr = (byte[]) this.d;
                i0 i0Var = (i0) this.f43175e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                l0 l0Var = this.f43173b;
                int i7 = l0Var.f42749a;
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
                y9 y9Var = (y9) this.f43174c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f43175e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                c20 c20Var2 = (c20) obj3;
                String str4 = y9Var.f43397f;
                l0 l0Var2 = this.f43173b;
                if (!l0.b(str4, l0Var2.t())) {
                    c20Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    l0Var2.d0(user, str2, 0L, str3, null, y9Var.f43396e, null, new s(11, y9Var, c20Var2), null, null);
                    return;
                }
        }
    }

    public t(y9 y9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f43174c = y9Var;
        this.f43173b = l0Var;
        this.d = user;
        this.f43175e = str;
    }
}
