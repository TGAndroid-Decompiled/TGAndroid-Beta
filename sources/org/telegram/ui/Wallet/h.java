package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.je1;
public final class h implements Utilities.Callback2 {
    public final int f33218a;
    public final j0 f33219b;

    public h(j0 j0Var, int i10) {
        this.f33218a = i10;
        this.f33219b = j0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f33218a) {
            case 0:
                j0 j0Var = this.f33219b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                j0Var.f33339y = -1;
                if (existingbalance != null) {
                    j0Var.f33324i = Boolean.valueOf(existingbalance.has_balance);
                    j0Var.f33325j = existingbalance.url;
                }
                Boolean bool = j0Var.f33324i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(j0Var.f33325j)) {
                    j0Var.I();
                    return;
                }
                return;
            case 1:
                j0 j0Var2 = this.f33219b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                j0Var2.f33337w = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    sb2.append(str);
                    j0.i(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = j0Var2.e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && j0Var2.f33327l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - j0Var2.f33326k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            j0Var2.f33327l = false;
                        }
                        j0Var2.e = walletState;
                        j0Var2.K();
                        j0Var2.I();
                        return;
                    }
                }
                j0Var2.f33327l = false;
                j0Var2.e = walletState;
                j0Var2.K();
                j0Var2.I();
                return;
            default:
                j0 j0Var3 = this.f33219b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                j0Var3.f33338x = -1;
                if (updates == null) {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "NULL_ERROR";
                    }
                    sb3.append(str2);
                    j0.i(sb3.toString());
                    return;
                }
                Utilities.stageQueue.postRunnable(new je1(12, j0Var3, updates));
                return;
        }
    }
}
