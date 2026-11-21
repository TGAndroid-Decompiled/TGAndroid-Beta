package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mz0;
public final class i implements q10 {
    public final int f44360a;
    public final u0 f44361b;

    public i(u0 u0Var, int i7) {
        this.f44360a = i7;
        this.f44361b = u0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f44360a) {
            case 0:
                u0 u0Var = this.f44361b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u0Var.E = -1;
                if (existingbalance != null) {
                    u0Var.f45129i = Boolean.valueOf(existingbalance.has_balance);
                    u0Var.f45130j = existingbalance.url;
                }
                Boolean bool = u0Var.f45129i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(u0Var.f45130j)) {
                    u0Var.T();
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f44361b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                u0Var2.C = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    sb2.append(str);
                    u0.n(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = u0Var2.f45126e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && u0Var2.f45132l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - u0Var2.f45131k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            u0Var2.f45132l = false;
                        }
                        u0Var2.f45126e = walletState;
                        u0Var2.V();
                        u0Var2.T();
                        return;
                    }
                }
                u0Var2.f45132l = false;
                u0Var2.f45126e = walletState;
                u0Var2.V();
                u0Var2.T();
                return;
            default:
                u0 u0Var3 = this.f44361b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                u0Var3.D = -1;
                if (updates == null) {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "NULL_ERROR";
                    }
                    sb3.append(str2);
                    u0.n(sb3.toString());
                    return;
                }
                Utilities.d.c(new mz0(25, u0Var3, updates));
                return;
        }
    }
}
