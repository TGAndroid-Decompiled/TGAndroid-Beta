package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class s implements Utilities.Callback3 {
    public final int f35115a = 0;
    public final l0 f35116b;
    public final Object f35117c;
    public final Object d;
    public final Object e;

    public s(l0 l0Var, Utilities.Callback callback, byte[] bArr, i0 i0Var) {
        this.f35116b = l0Var;
        this.f35117c = callback;
        this.d = bArr;
        this.e = i0Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.f35115a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f35117c;
                byte[] bArr = (byte[]) this.d;
                i0 i0Var = (i0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                l0 l0Var = this.f35116b;
                int i10 = l0Var.f34741a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error != null) {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        callback.run(str);
                        return;
                    }
                    l0Var.i0(walletState);
                    new p0(l0.v(), l0Var.s(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, i0Var, callback);
                    l0Var.P();
                    return;
                }
                return;
            default:
                s9 s9Var = (s9) this.f35117c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = s9Var.e;
                l0 l0Var2 = this.f35116b;
                if (!l0.a(str4, l0Var2.s())) {
                    callback2.run("WALLET_CHANGED");
                    return;
                } else {
                    l0Var2.b0(user, str2, 0L, str3, null, s9Var.d, null, new w(11, s9Var, callback2), null, null);
                    return;
                }
        }
    }

    public s(s9 s9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f35117c = s9Var;
        this.f35116b = l0Var;
        this.d = user;
        this.e = str;
    }
}
