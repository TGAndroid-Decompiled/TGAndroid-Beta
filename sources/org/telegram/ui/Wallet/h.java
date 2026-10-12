package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.u31;
public final class h implements Utilities.Callback2 {
    public final int f34816a;
    public final l0 f34817b;

    public h(l0 l0Var, int i10) {
        this.f34816a = i10;
        this.f34817b = l0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f34816a) {
            case 0:
                l0 l0Var = this.f34817b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0Var.f35017y = -1;
                if (existingbalance != null) {
                    l0Var.f35002i = Boolean.valueOf(existingbalance.has_balance);
                    l0Var.f35003j = existingbalance.url;
                }
                Boolean bool = l0Var.f35002i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(l0Var.f35003j)) {
                    l0Var.I();
                    return;
                }
                return;
            case 1:
                l0 l0Var2 = this.f34817b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l0Var2.f35015w = -1;
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
                    TL_wallet.WalletState walletState2 = l0Var2.f34999e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && l0Var2.f35005l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - l0Var2.f35004k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            l0Var2.f35005l = false;
                        }
                        l0Var2.f34999e = walletState;
                        l0Var2.K();
                        l0Var2.I();
                        return;
                    }
                }
                l0Var2.f35005l = false;
                l0Var2.f34999e = walletState;
                l0Var2.K();
                l0Var2.I();
                return;
            default:
                l0 l0Var3 = this.f34817b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0Var3.f35016x = -1;
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
                Utilities.stageQueue.postRunnable(new u31(29, l0Var3, updates));
                return;
        }
    }
}
