package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.t11;
public final class i implements j20 {
    public final int f34690a;
    public final k0 f34691b;

    public i(k0 k0Var, int i10) {
        this.f34690a = i10;
        this.f34691b = k0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f34690a) {
            case 0:
                k0 k0Var = this.f34691b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0Var.C = -1;
                if (existingbalance != null) {
                    k0Var.f34781i = Boolean.valueOf(existingbalance.has_balance);
                    k0Var.f34782j = existingbalance.url;
                }
                Boolean bool = k0Var.f34781i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(k0Var.f34782j)) {
                    k0Var.L();
                    return;
                }
                return;
            case 1:
                k0 k0Var2 = this.f34691b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0Var2.A = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    sb2.append(str);
                    k0.j(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = k0Var2.e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && k0Var2.f34784l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - k0Var2.f34783k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            k0Var2.f34784l = false;
                        }
                        k0Var2.e = walletState;
                        k0Var2.N();
                        k0Var2.L();
                        return;
                    }
                }
                k0Var2.f34784l = false;
                k0Var2.e = walletState;
                k0Var2.N();
                k0Var2.L();
                return;
            default:
                k0 k0Var3 = this.f34691b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0Var3.B = -1;
                if (updates == null) {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "NULL_ERROR";
                    }
                    sb3.append(str2);
                    k0.j(sb3.toString());
                    return;
                }
                Utilities.d.c(new t11(23, k0Var3, updates));
                return;
        }
    }
}
