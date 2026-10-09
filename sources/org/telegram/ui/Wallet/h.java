package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ii1;
public final class h implements Utilities.Callback2 {
    public final int f34956a;
    public final k0 f34957b;

    public h(k0 k0Var, int i10) {
        this.f34956a = i10;
        this.f34957b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f34956a) {
            case 0:
                k0 k0Var = this.f34957b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0Var.f35114y = -1;
                if (existingbalance != null) {
                    k0Var.f35099i = Boolean.valueOf(existingbalance.has_balance);
                    k0Var.f35100j = existingbalance.url;
                }
                Boolean bool = k0Var.f35099i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(k0Var.f35100j)) {
                    k0Var.I();
                    return;
                }
                return;
            case 1:
                k0 k0Var2 = this.f34957b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0Var2.f35112w = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    sb2.append(str);
                    k0.i(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = k0Var2.f35096e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && k0Var2.f35102l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - k0Var2.f35101k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            k0Var2.f35102l = false;
                        }
                        k0Var2.f35096e = walletState;
                        k0Var2.K();
                        k0Var2.I();
                        return;
                    }
                }
                k0Var2.f35102l = false;
                k0Var2.f35096e = walletState;
                k0Var2.K();
                k0Var2.I();
                return;
            default:
                k0 k0Var3 = this.f34957b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0Var3.f35113x = -1;
                if (updates == null) {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "NULL_ERROR";
                    }
                    sb3.append(str2);
                    k0.i(sb3.toString());
                    return;
                }
                Utilities.stageQueue.postRunnable(new ii1(1, k0Var3, updates));
                return;
        }
    }
}
