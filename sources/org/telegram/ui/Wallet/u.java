package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class u implements Utilities.Callback3 {
    public final int f35489a = 0;
    public final k0 f35490b;
    public final Object f35491c;
    public final Object d;
    public final Object f35492e;

    public u(k0 k0Var, Utilities.Callback callback, byte[] bArr, h0 h0Var) {
        this.f35490b = k0Var;
        this.f35491c = callback;
        this.d = bArr;
        this.f35492e = h0Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.f35489a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f35491c;
                byte[] bArr = (byte[]) this.d;
                h0 h0Var = (h0) this.f35492e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                k0 k0Var = this.f35490b;
                int i10 = k0Var.f35093a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        callback.run(str);
                        return;
                    }
                    k0Var.g0(walletState);
                    new p0(k0.u(), k0Var.r(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, h0Var, callback);
                    k0Var.O();
                    return;
                }
                return;
            default:
                r8 r8Var = (r8) this.f35491c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f35492e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = r8Var.f35424e;
                k0 k0Var2 = this.f35490b;
                if (!k0.b(str4, k0Var2.r())) {
                    callback2.run("WALLET_CHANGED");
                    return;
                } else {
                    k0Var2.Z(user, str2, 0L, str3, null, r8Var.d, null, new y6(4, r8Var, callback2), null);
                    return;
                }
        }
    }

    public u(r8 r8Var, k0 k0Var, TLRPC.User user, String str) {
        this.f35491c = r8Var;
        this.f35490b = k0Var;
        this.d = user;
        this.f35492e = str;
    }
}
