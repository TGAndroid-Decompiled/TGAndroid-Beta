package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ma1;
public final class i implements n10 {
    public final int f42632a;
    public final k0 f42633b;

    public i(k0 k0Var, int i3) {
        this.f42632a = i3;
        this.f42633b = k0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f42632a) {
            case 0:
                k0 k0Var = this.f42633b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0Var.C = -1;
                if (existingbalance != null) {
                    k0Var.f42724i = Boolean.valueOf(existingbalance.has_balance);
                    k0Var.f42725j = existingbalance.url;
                }
                Boolean bool = k0Var.f42724i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(k0Var.f42725j)) {
                    k0Var.L();
                    return;
                }
                return;
            case 1:
                k0 k0Var2 = this.f42633b;
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
                    TL_wallet.WalletState walletState2 = k0Var2.f42721e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && k0Var2.f42727l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - k0Var2.f42726k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            k0Var2.f42727l = false;
                        }
                        k0Var2.f42721e = walletState;
                        k0Var2.N();
                        k0Var2.L();
                        return;
                    }
                }
                k0Var2.f42727l = false;
                k0Var2.f42721e = walletState;
                k0Var2.N();
                k0Var2.L();
                return;
            default:
                k0 k0Var3 = this.f42633b;
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
                Utilities.d.c(new ma1(5, k0Var3, updates));
                return;
        }
    }
}
