package org.telegram.ui.Wallet;

import org.telegram.messenger.i10;
import org.telegram.messenger.r10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;
public final class w implements r10 {
    public final int f45323a = 1;
    public final v0 f45324b;
    public final Object f45325c;
    public final Object d;
    public final Object f45326e;

    public w(v0 v0Var, w10 w10Var, byte[] bArr, s0 s0Var) {
        this.f45324b = v0Var;
        this.f45325c = w10Var;
        this.d = bArr;
        this.f45326e = s0Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.f45323a) {
            case 0:
                w10 w10Var = (w10) this.f45325c;
                byte[] bArr = (byte[]) this.d;
                s0 s0Var = (s0) this.f45326e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                v0 v0Var = this.f45324b;
                int i7 = v0Var.f45255a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        w10Var.a(str);
                        return;
                    }
                    v0Var.w0(walletState);
                    new a1(i7, v0.C(), v0Var.y()).q(i10.i(i7).e(), bArr, s0Var, w10Var);
                    v0Var.Z();
                    return;
                }
                return;
            default:
                oa oaVar = (oa) this.f45325c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f45326e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                w10 w10Var2 = (w10) obj3;
                String str4 = oaVar.f44841f;
                v0 v0Var2 = this.f45324b;
                if (!v0.c(str4, v0Var2.y())) {
                    w10Var2.a("WALLET_CHANGED");
                    return;
                } else {
                    v0Var2.m0(user, str2, 0L, str3, null, oaVar.f44839e, null, new a31(16, oaVar, w10Var2), null);
                    return;
                }
        }
    }

    public w(oa oaVar, v0 v0Var, TLRPC.User user, String str) {
        this.f45325c = oaVar;
        this.f45324b = v0Var;
        this.d = user;
        this.f45326e = str;
    }
}
