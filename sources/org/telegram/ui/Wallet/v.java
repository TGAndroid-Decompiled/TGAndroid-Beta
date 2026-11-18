package org.telegram.ui.Wallet;

import org.telegram.messenger.j10;
import org.telegram.messenger.s10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;
public final class v implements s10 {
    public final int f45151a = 1;
    public final u0 f45152b;
    public final Object f45153c;
    public final Object d;
    public final Object f45154e;

    public v(u0 u0Var, x10 x10Var, byte[] bArr, r0 r0Var) {
        this.f45152b = u0Var;
        this.f45153c = x10Var;
        this.d = bArr;
        this.f45154e = r0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f45151a) {
            case 0:
                x10 x10Var = (x10) this.f45153c;
                byte[] bArr = (byte[]) this.d;
                r0 r0Var = (r0) this.f45154e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                u0 u0Var = this.f45152b;
                int i7 = u0Var.f45083a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        x10Var.a(str);
                        return;
                    }
                    u0Var.w0(walletState);
                    new z0(i7, u0.C(), u0Var.y()).q(j10.i(i7).e(), bArr, r0Var, x10Var);
                    u0Var.Z();
                    return;
                }
                return;
            default:
                na naVar = (na) this.f45153c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f45154e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                x10 x10Var2 = (x10) obj3;
                String str4 = naVar.f44669f;
                u0 u0Var2 = this.f45152b;
                if (!u0.c(str4, u0Var2.y())) {
                    x10Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    u0Var2.m0(user, str2, 0L, str3, null, naVar.f44667e, null, new p51(15, naVar, x10Var2), null);
                    return;
                }
        }
    }

    public v(na naVar, u0 u0Var, TLRPC.User user, String str) {
        this.f45153c = naVar;
        this.f45152b = u0Var;
        this.d = user;
        this.f45154e = str;
    }
}
