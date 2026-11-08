package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class i implements v10 {
    public final int f42602a;
    public final m0 f42603b;

    public i(m0 m0Var, int i7) {
        this.f42602a = i7;
        this.f42603b = m0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f42602a) {
            case 0:
                m0 m0Var = this.f42603b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m0Var.C = -1;
                if (existingbalance != null) {
                    m0Var.f42768i = Boolean.valueOf(existingbalance.has_balance);
                    m0Var.f42769j = existingbalance.url;
                }
                Boolean bool = m0Var.f42768i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(m0Var.f42769j)) {
                    m0Var.L();
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f42603b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m0Var2.A = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    sb2.append(str);
                    m0.j(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = m0Var2.f42765e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && m0Var2.f42771l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - m0Var2.f42770k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            m0Var2.f42771l = false;
                        }
                        m0Var2.f42765e = walletState;
                        m0Var2.N();
                        m0Var2.L();
                        return;
                    }
                }
                m0Var2.f42771l = false;
                m0Var2.f42765e = walletState;
                m0Var2.N();
                m0Var2.L();
                return;
            default:
                m0 m0Var3 = this.f42603b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m0Var3.B = -1;
                if (updates == null) {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "NULL_ERROR";
                    }
                    sb3.append(str2);
                    m0.j(sb3.toString());
                    return;
                }
                Utilities.d.c(new n(0, m0Var3, updates));
                return;
        }
    }
}
