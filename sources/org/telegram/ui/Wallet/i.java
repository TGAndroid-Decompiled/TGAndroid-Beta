package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.sb1;
public final class i implements v10 {
    public final int f42597a;
    public final l0 f42598b;

    public i(l0 l0Var, int i7) {
        this.f42597a = i7;
        this.f42598b = l0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f42597a) {
            case 0:
                l0 l0Var = this.f42598b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0Var.C = -1;
                if (existingbalance != null) {
                    l0Var.f42755i = Boolean.valueOf(existingbalance.has_balance);
                    l0Var.f42756j = existingbalance.url;
                }
                Boolean bool = l0Var.f42755i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(l0Var.f42756j)) {
                    l0Var.L();
                    return;
                }
                return;
            case 1:
                l0 l0Var2 = this.f42598b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l0Var2.A = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    sb2.append(str);
                    l0.j(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = l0Var2.f42752e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && l0Var2.f42758l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - l0Var2.f42757k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            l0Var2.f42758l = false;
                        }
                        l0Var2.f42752e = walletState;
                        l0Var2.N();
                        l0Var2.L();
                        return;
                    }
                }
                l0Var2.f42758l = false;
                l0Var2.f42752e = walletState;
                l0Var2.N();
                l0Var2.L();
                return;
            default:
                l0 l0Var3 = this.f42598b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0Var3.B = -1;
                if (updates == null) {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "NULL_ERROR";
                    }
                    sb3.append(str2);
                    l0.j(sb3.toString());
                    return;
                }
                Utilities.d.c(new sb1(2, l0Var3, updates));
                return;
        }
    }
}
