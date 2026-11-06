package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class i implements v10 {
    public final int f42604a;
    public final n0 f42605b;

    public i(n0 n0Var, int i7) {
        this.f42604a = i7;
        this.f42605b = n0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f42604a) {
            case 0:
                n0 n0Var = this.f42605b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n0Var.C = -1;
                if (existingbalance != null) {
                    n0Var.f42799i = Boolean.valueOf(existingbalance.has_balance);
                    n0Var.f42800j = existingbalance.url;
                }
                Boolean bool = n0Var.f42799i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(n0Var.f42800j)) {
                    n0Var.L();
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f42605b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                n0Var2.A = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    sb2.append(str);
                    n0.j(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = n0Var2.f42796e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && n0Var2.f42802l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - n0Var2.f42801k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            n0Var2.f42802l = false;
                        }
                        n0Var2.f42796e = walletState;
                        n0Var2.N();
                        n0Var2.L();
                        return;
                    }
                }
                n0Var2.f42802l = false;
                n0Var2.f42796e = walletState;
                n0Var2.N();
                n0Var2.L();
                return;
            default:
                n0 n0Var3 = this.f42605b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                n0Var3.B = -1;
                if (updates == null) {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "NULL_ERROR";
                    }
                    sb3.append(str2);
                    n0.j(sb3.toString());
                    return;
                }
                Utilities.d.c(new n(0, n0Var3, updates));
                return;
        }
    }
}
