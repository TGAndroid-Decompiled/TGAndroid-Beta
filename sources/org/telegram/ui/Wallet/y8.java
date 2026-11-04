package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
public final class y8 implements n10 {
    public final int f43482a;
    public final m9 f43483b;

    public y8(m9 m9Var, int i3) {
        this.f43482a = i3;
        this.f43483b = m9Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3;
        int i10;
        switch (this.f43482a) {
            case 0:
                String str = (String) obj2;
                m9.g0(this.f43483b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                m9 m9Var = this.f43483b;
                m9Var.getClass();
                if (wallettransaction != null) {
                    m9Var.f42876f0 = wallettransaction.fee;
                    m9Var.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                m9 m9Var2 = this.f43483b;
                m9Var2.f42888r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    m9Var2.finishFragment();
                    return;
                }
                m9Var2.f42873e = walletuseraddress;
                if (walletuseraddress != null) {
                    m9Var2.h = walletuseraddress.address;
                }
                ai.h4 h4Var = m9Var2.f34298a;
                if (h4Var != null) {
                    h4Var.f35594g3.O(true);
                }
                m9Var2.C0();
                m9Var2.t0();
                q8 q8Var = m9Var2.f42895w;
                if (q8Var != null) {
                    q8Var.a(m9Var2.h, m9Var2.f42875f);
                    return;
                }
                return;
            case 3:
                m9 m9Var3 = this.f43483b;
                m9Var3.f42878h0 = (String) obj;
                m9Var3.f42879i0 = ((Boolean) obj2).booleanValue();
                m9Var3.Q.setText(m9Var3.f42878h0);
                TextView textView = m9Var3.Q;
                if (TextUtils.isEmpty(m9Var3.f42878h0)) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                textView.setVisibility(i3);
                m9Var3.E0();
                return;
            default:
                m9 m9Var4 = this.f43483b;
                m9Var4.f42878h0 = (String) obj;
                m9Var4.f42879i0 = ((Boolean) obj2).booleanValue();
                m9Var4.Q.setText(m9Var4.f42878h0);
                TextView textView2 = m9Var4.Q;
                if (TextUtils.isEmpty(m9Var4.f42878h0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView2.setVisibility(i10);
                m9Var4.E0();
                return;
        }
    }
}
