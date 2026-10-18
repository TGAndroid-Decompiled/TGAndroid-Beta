package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class v implements Utilities.Callback3 {
    public final int f34982a = 0;
    public final m0 f34983b;
    public final Object f34984c;
    public final Object d;
    public final Object e;

    public v(m0 m0Var, Utilities.Callback callback, byte[] bArr, j0 j0Var) {
        this.f34983b = m0Var;
        this.f34984c = callback;
        this.d = bArr;
        this.e = j0Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.f34982a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f34984c;
                byte[] bArr = (byte[]) this.d;
                j0 j0Var = (j0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                m0 m0Var = this.f34983b;
                int i10 = m0Var.f34530a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        callback.run(str);
                        return;
                    }
                    m0Var.i0(walletState);
                    new q0(m0.v(), m0Var.s(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, j0Var, callback);
                    m0Var.P();
                    return;
                }
                return;
            default:
                w9 w9Var = (w9) this.f34984c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = w9Var.e;
                m0 m0Var2 = this.f34983b;
                if (!m0.a(str4, m0Var2.s())) {
                    callback2.run("WALLET_CHANGED");
                    return;
                } else {
                    m0Var2.b0(user, str2, 0L, str3, null, w9Var.d, null, new x(11, w9Var, callback2), null, null);
                    return;
                }
        }
    }

    public v(w9 w9Var, m0 m0Var, TLRPC.User user, String str) {
        this.f34984c = w9Var;
        this.f34983b = m0Var;
        this.d = user;
        this.e = str;
    }
}
