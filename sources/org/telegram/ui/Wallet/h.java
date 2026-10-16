package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.wg1;
public final class h implements Utilities.Callback2 {
    public final int f32963a;
    public final k0 f32964b;

    public h(k0 k0Var, int i10) {
        this.f32963a = i10;
        this.f32964b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f32963a) {
            case 0:
                k0 k0Var = this.f32964b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0Var.f33112y = -1;
                if (existingbalance != null) {
                    k0Var.f33097i = Boolean.valueOf(existingbalance.has_balance);
                    k0Var.f33098j = existingbalance.url;
                }
                Boolean bool = k0Var.f33097i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(k0Var.f33098j)) {
                    k0Var.I();
                    return;
                }
                return;
            case 1:
                k0 k0Var2 = this.f32964b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0Var2.f33110w = -1;
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
                    TL_wallet.WalletState walletState2 = k0Var2.e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && k0Var2.f33100l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - k0Var2.f33099k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            k0Var2.f33100l = false;
                        }
                        k0Var2.e = walletState;
                        k0Var2.K();
                        k0Var2.I();
                        return;
                    }
                }
                k0Var2.f33100l = false;
                k0Var2.e = walletState;
                k0Var2.K();
                k0Var2.I();
                return;
            default:
                k0 k0Var3 = this.f32964b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0Var3.f33111x = -1;
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
                Utilities.stageQueue.postRunnable(new wg1(7, k0Var3, updates));
                return;
        }
    }
}
