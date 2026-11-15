package org.telegram.ui.Wallet;

import org.telegram.messenger.m10;
import org.telegram.messenger.u10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.x21;
public final class t implements u10 {
    public final int f44500a = 0;
    public final l0 f44501b;
    public final Object f44502c;
    public final Object d;
    public final Object f44503e;

    public t(l0 l0Var, z10 z10Var, byte[] bArr, i0 i0Var) {
        this.f44501b = l0Var;
        this.f44502c = z10Var;
        this.d = bArr;
        this.f44503e = i0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f44500a) {
            case 0:
                z10 z10Var = (z10) this.f44502c;
                byte[] bArr = (byte[]) this.d;
                i0 i0Var = (i0) this.f44503e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                l0 l0Var = this.f44501b;
                int i7 = l0Var.f44078a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        z10Var.a(str);
                        return;
                    }
                    l0Var.l0(walletState);
                    new p0(i7, l0.w(), l0Var.t()).p(m10.i(i7).e(), bArr, i0Var, z10Var);
                    l0Var.R();
                    return;
                }
                return;
            default:
                z9 z9Var = (z9) this.f44502c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f44503e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                z10 z10Var2 = (z10) obj3;
                String str4 = z9Var.f44859f;
                l0 l0Var2 = this.f44501b;
                if (!l0.b(str4, l0Var2.t())) {
                    z10Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    l0Var2.d0(user, str2, 0L, str3, null, z9Var.f44857e, null, new x21(16, z9Var, z10Var2), null, null);
                    return;
                }
        }
    }

    public t(z9 z9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f44502c = z9Var;
        this.f44501b = l0Var;
        this.d = user;
        this.f44503e = str;
    }
}
