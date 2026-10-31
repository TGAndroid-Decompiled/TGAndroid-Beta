package org.telegram.ui.Wallet;

import org.telegram.messenger.d20;
import org.telegram.messenger.l20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f11;
public final class s implements l20 {
    public final int f35164a = 1;
    public final k0 f35165b;
    public final Object f35166c;
    public final Object d;
    public final Object e;

    public s(k0 k0Var, q20 q20Var, byte[] bArr, h0 h0Var) {
        this.f35165b = k0Var;
        this.f35166c = q20Var;
        this.d = bArr;
        this.e = h0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f35164a) {
            case 0:
                q20 q20Var = (q20) this.f35166c;
                byte[] bArr = (byte[]) this.d;
                h0 h0Var = (h0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                k0 k0Var = this.f35165b;
                int i10 = k0Var.f34776a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        q20Var.a(str);
                        return;
                    }
                    k0Var.l0(walletState);
                    new p0(i10, k0.w(), k0Var.t()).p(d20.i(i10).e(), bArr, h0Var, q20Var);
                    k0Var.R();
                    return;
                }
                return;
            default:
                ba baVar = (ba) this.f35166c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                q20 q20Var2 = (q20) obj3;
                String str4 = baVar.f34283f;
                k0 k0Var2 = this.f35165b;
                if (!k0.b(str4, k0Var2.t())) {
                    q20Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    k0Var2.d0(user, str2, 0L, str3, null, baVar.e, null, new f11(17, baVar, q20Var2), null, null);
                    return;
                }
        }
    }

    public s(ba baVar, k0 k0Var, TLRPC.User user, String str) {
        this.f35166c = baVar;
        this.f35165b = k0Var;
        this.d = user;
        this.e = str;
    }
}
