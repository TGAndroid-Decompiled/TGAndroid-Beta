package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class h implements Utilities.Callback2 {
    public final int f35005a;
    public final l0 f35006b;

    public h(l0 l0Var, int i10) {
        this.f35005a = i10;
        this.f35006b = l0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f35005a) {
            case 0:
                l0 l0Var = this.f35006b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0Var.f35206y = -1;
                if (existingbalance != null) {
                    l0Var.f35191i = Boolean.valueOf(existingbalance.has_balance);
                    l0Var.f35192j = existingbalance.url;
                }
                Boolean bool = l0Var.f35191i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(l0Var.f35192j)) {
                    l0Var.I();
                    return;
                }
                return;
            case 1:
                l0 l0Var2 = this.f35006b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l0Var2.f35204w = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    sb2.append(str);
                    l0.i(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = l0Var2.f35188e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && l0Var2.f35194l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - l0Var2.f35193k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            l0Var2.f35194l = false;
                        }
                        l0Var2.f35188e = walletState;
                        l0Var2.K();
                        l0Var2.I();
                        return;
                    }
                }
                l0Var2.f35194l = false;
                l0Var2.f35188e = walletState;
                l0Var2.K();
                l0Var2.I();
                return;
            default:
                l0 l0Var3 = this.f35006b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0Var3.f35205x = -1;
                if (updates == null) {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "NULL_ERROR";
                    }
                    sb3.append(str2);
                    l0.i(sb3.toString());
                    return;
                }
                Utilities.stageQueue.postRunnable(new i(0, l0Var3, updates));
                return;
        }
    }
}
