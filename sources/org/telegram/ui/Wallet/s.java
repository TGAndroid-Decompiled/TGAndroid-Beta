package org.telegram.ui.Wallet;

import org.telegram.messenger.h10;
import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.e51;
public final class s implements p10 {
    public final int f43136a = 0;
    public final k0 f43137b;
    public final Object f43138c;
    public final Object d;
    public final Object f43139e;

    public s(k0 k0Var, u10 u10Var, byte[] bArr, h0 h0Var) {
        this.f43137b = k0Var;
        this.f43138c = u10Var;
        this.d = bArr;
        this.f43139e = h0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f43136a) {
            case 0:
                u10 u10Var = (u10) this.f43138c;
                byte[] bArr = (byte[]) this.d;
                h0 h0Var = (h0) this.f43139e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                k0 k0Var = this.f43137b;
                int i3 = k0Var.f42718a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        u10Var.a(str);
                        return;
                    }
                    k0Var.l0(walletState);
                    new o0(i3, k0.w(), k0Var.t()).p(h10.i(i3).e(), bArr, h0Var, u10Var);
                    k0Var.R();
                    return;
                }
                return;
            default:
                w9 w9Var = (w9) this.f43138c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f43139e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                u10 u10Var2 = (u10) obj3;
                String str4 = w9Var.f43363f;
                k0 k0Var2 = this.f43137b;
                if (!k0.b(str4, k0Var2.t())) {
                    u10Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    k0Var2.d0(user, str2, 0L, str3, null, w9Var.f43361e, null, new e51(14, w9Var, u10Var2), null, null);
                    return;
                }
        }
    }

    public s(w9 w9Var, k0 k0Var, TLRPC.User user, String str) {
        this.f43138c = w9Var;
        this.f43137b = k0Var;
        this.d = user;
        this.f43139e = str;
    }
}
