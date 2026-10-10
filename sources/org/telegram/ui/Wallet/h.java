package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ii1;
public final class h implements Utilities.Callback2 {
    public final int f35036a;
    public final k0 f35037b;

    public h(k0 k0Var, int i10) {
        this.f35036a = i10;
        this.f35037b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f35036a) {
            case 0:
                k0 k0Var = this.f35037b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0Var.f35176y = -1;
                if (existingbalance != null) {
                    k0Var.f35161i = Boolean.valueOf(existingbalance.has_balance);
                    k0Var.f35162j = existingbalance.url;
                }
                Boolean bool = k0Var.f35161i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(k0Var.f35162j)) {
                    k0Var.I();
                    return;
                }
                return;
            case 1:
                k0 k0Var2 = this.f35037b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0Var2.f35174w = -1;
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
                    TL_wallet.WalletState walletState2 = k0Var2.f35158e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && k0Var2.f35164l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - k0Var2.f35163k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            k0Var2.f35164l = false;
                        }
                        k0Var2.f35158e = walletState;
                        k0Var2.K();
                        k0Var2.I();
                        return;
                    }
                }
                k0Var2.f35164l = false;
                k0Var2.f35158e = walletState;
                k0Var2.K();
                k0Var2.I();
                return;
            default:
                k0 k0Var3 = this.f35037b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0Var3.f35175x = -1;
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
