package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t implements Utilities.Callback3 {
    public final int f33690a = 0;
    public final j0 f33691b;
    public final Object f33692c;
    public final Object d;
    public final Object e;

    public t(j0 j0Var, Utilities.Callback callback, byte[] bArr, g0 g0Var) {
        this.f33691b = j0Var;
        this.f33692c = callback;
        this.d = bArr;
        this.e = g0Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.f33690a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f33692c;
                byte[] bArr = (byte[]) this.d;
                g0 g0Var = (g0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                j0 j0Var = this.f33691b;
                int i10 = j0Var.f33319a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        callback.run(str);
                        return;
                    }
                    j0Var.g0(walletState);
                    new o0(j0.u(), j0Var.r(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, g0Var, callback);
                    j0Var.O();
                    return;
                }
                return;
            default:
                r8 r8Var = (r8) this.f33692c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = r8Var.e;
                j0 j0Var2 = this.f33691b;
                if (!j0.b(str4, j0Var2.r())) {
                    callback2.run("WALLET_CHANGED");
                    return;
                } else {
                    j0Var2.Z(user, str2, 0L, str3, null, r8Var.d, null, new y6(4, r8Var, callback2), null);
                    return;
                }
        }
    }

    public t(r8 r8Var, j0 j0Var, TLRPC.User user, String str) {
        this.f33692c = r8Var;
        this.f33691b = j0Var;
        this.d = user;
        this.e = str;
    }
}
