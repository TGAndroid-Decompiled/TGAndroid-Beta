package org.telegram.ui.Wallet;

import org.telegram.messenger.k10;
import org.telegram.messenger.t10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;
public final class v implements t10 {
    public final int f45196a = 1;
    public final u0 f45197b;
    public final Object f45198c;
    public final Object d;
    public final Object f45199e;

    public v(u0 u0Var, y10 y10Var, byte[] bArr, r0 r0Var) {
        this.f45197b = u0Var;
        this.f45198c = y10Var;
        this.d = bArr;
        this.f45199e = r0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f45196a) {
            case 0:
                y10 y10Var = (y10) this.f45198c;
                byte[] bArr = (byte[]) this.d;
                r0 r0Var = (r0) this.f45199e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                u0 u0Var = this.f45197b;
                int i7 = u0Var.f45127a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        y10Var.a(str);
                        return;
                    }
                    u0Var.w0(walletState);
                    new z0(i7, u0.C(), u0Var.y()).q(k10.i(i7).e(), bArr, r0Var, y10Var);
                    u0Var.Z();
                    return;
                }
                return;
            default:
                na naVar = (na) this.f45198c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f45199e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                y10 y10Var2 = (y10) obj3;
                String str4 = naVar.f44713f;
                u0 u0Var2 = this.f45197b;
                if (!u0.c(str4, u0Var2.y())) {
                    y10Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    u0Var2.m0(user, str2, 0L, str3, null, naVar.f44711e, null, new p51(15, naVar, y10Var2), null);
                    return;
                }
        }
    }

    public v(na naVar, u0 u0Var, TLRPC.User user, String str) {
        this.f45198c = naVar;
        this.f45197b = u0Var;
        this.d = user;
        this.f45199e = str;
    }
}
