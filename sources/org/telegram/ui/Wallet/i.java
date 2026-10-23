package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.o71;
public final class i implements Utilities.Callback2 {
    public final int f34588a;
    public final l0 f34589b;

    public i(l0 l0Var, int i10) {
        this.f34588a = i10;
        this.f34589b = l0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f34588a) {
            case 0:
                l0 l0Var = this.f34589b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0Var.C = -1;
                if (existingbalance != null) {
                    l0Var.f34746i = Boolean.valueOf(existingbalance.has_balance);
                    l0Var.f34747j = existingbalance.url;
                }
                Boolean bool = l0Var.f34746i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(l0Var.f34747j)) {
                    l0Var.J();
                    return;
                }
                return;
            case 1:
                l0 l0Var2 = this.f34589b;
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
                    l0.i(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = l0Var2.e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && l0Var2.f34749l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - l0Var2.f34748k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            l0Var2.f34749l = false;
                        }
                        l0Var2.e = walletState;
                        l0Var2.L();
                        l0Var2.J();
                        return;
                    }
                }
                l0Var2.f34749l = false;
                l0Var2.e = walletState;
                l0Var2.L();
                l0Var2.J();
                return;
            default:
                l0 l0Var3 = this.f34589b;
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
                    l0.i(sb3.toString());
                    return;
                }
                Utilities.stageQueue.postRunnable(new o71(23, l0Var3, updates));
                return;
        }
    }
}
