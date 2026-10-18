package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.m71;
public final class i implements Utilities.Callback2 {
    public final int f34316a;
    public final m0 f34317b;

    public i(m0 m0Var, int i10) {
        this.f34316a = i10;
        this.f34317b = m0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f34316a) {
            case 0:
                m0 m0Var = this.f34317b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m0Var.C = -1;
                if (existingbalance != null) {
                    m0Var.f34535i = Boolean.valueOf(existingbalance.has_balance);
                    m0Var.f34536j = existingbalance.url;
                }
                Boolean bool = m0Var.f34535i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(m0Var.f34536j)) {
                    m0Var.J();
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f34317b;
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
                    m0.i(sb2.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = m0Var2.e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && m0Var2.f34538l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - m0Var2.f34537k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            m0Var2.f34538l = false;
                        }
                        m0Var2.e = walletState;
                        m0Var2.L();
                        m0Var2.J();
                        return;
                    }
                }
                m0Var2.f34538l = false;
                m0Var2.e = walletState;
                m0Var2.L();
                m0Var2.J();
                return;
            default:
                m0 m0Var3 = this.f34317b;
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
                    m0.i(sb3.toString());
                    return;
                }
                Utilities.stageQueue.postRunnable(new m71(23, m0Var3, updates));
                return;
        }
    }
}
