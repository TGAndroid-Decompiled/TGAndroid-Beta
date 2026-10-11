package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class v implements Utilities.Callback3 {
    public final int f35655a = 0;
    public final l0 f35656b;
    public final Object f35657c;
    public final Object d;
    public final Object f35658e;

    public v(l0 l0Var, Utilities.Callback callback, byte[] bArr, i0 i0Var) {
        this.f35656b = l0Var;
        this.f35657c = callback;
        this.d = bArr;
        this.f35658e = i0Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.f35655a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f35657c;
                byte[] bArr = (byte[]) this.d;
                i0 i0Var = (i0) this.f35658e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                l0 l0Var = this.f35656b;
                int i10 = l0Var.f35219a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        callback.run(str);
                        return;
                    }
                    l0Var.g0(walletState);
                    new q0(l0.u(), l0Var.r(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, i0Var, callback);
                    l0Var.O();
                    return;
                }
                return;
            default:
                u8 u8Var = (u8) this.f35657c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.f35658e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = u8Var.f35647e;
                l0 l0Var2 = this.f35656b;
                if (!l0.b(str4, l0Var2.r())) {
                    callback2.run("WALLET_CHANGED");
                    return;
                } else {
                    l0Var2.Z(user, str2, 0L, str3, null, u8Var.d, null, new b7(4, u8Var, callback2), null);
                    return;
                }
        }
    }

    public v(u8 u8Var, l0 l0Var, TLRPC.User user, String str) {
        this.f35657c = u8Var;
        this.f35656b = l0Var;
        this.d = user;
        this.f35658e = str;
    }
}
