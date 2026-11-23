package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.iy0;
public final class i implements p10 {
    public final int f44453a;
    public final v0 f44454b;

    public i(v0 v0Var, int i7) {
        this.f44453a = i7;
        this.f44454b = v0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f44453a) {
            case 0:
                v0 v0Var = this.f44454b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v0Var.E = -1;
                if (existingbalance != null) {
                    v0Var.f45261i = Boolean.valueOf(existingbalance.has_balance);
                    v0Var.f45262j = existingbalance.url;
                }
                Boolean bool = v0Var.f45261i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(v0Var.f45262j)) {
                    v0Var.T();
                    return;
                }
                return;
            case 1:
                v0 v0Var2 = this.f44454b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                v0Var2.C = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    sb2.append(str);
                    v0.n(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = v0Var2.f45258e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && v0Var2.f45264l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - v0Var2.f45263k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            v0Var2.f45264l = false;
                        }
                        v0Var2.f45258e = walletState;
                        v0Var2.V();
                        v0Var2.T();
                        return;
                    }
                }
                v0Var2.f45264l = false;
                v0Var2.f45258e = walletState;
                v0Var2.V();
                v0Var2.T();
                return;
            default:
                v0 v0Var3 = this.f44454b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                v0Var3.D = -1;
                if (updates == null) {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "NULL_ERROR";
                    }
                    sb3.append(str2);
                    v0.n(sb3.toString());
                    return;
                }
                Utilities.d.c(new iy0(29, v0Var3, updates));
                return;
        }
    }
}
