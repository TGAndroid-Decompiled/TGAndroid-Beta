package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class y8 implements v10 {
    public final int f43445a;
    public final m9 f43446b;

    public y8(m9 m9Var, int i7) {
        this.f43445a = i7;
        this.f43446b = m9Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f43445a) {
            case 0:
                String str = (String) obj2;
                m9.g0(this.f43446b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                m9 m9Var = this.f43446b;
                m9Var.getClass();
                if (wallettransaction != null) {
                    m9Var.f42819e0 = wallettransaction.fee;
                    m9Var.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                m9 m9Var2 = this.f43446b;
                m9Var2.f42833r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    m9Var2.finishFragment();
                    return;
                }
                m9Var2.f42818e = walletuseraddress;
                if (walletuseraddress != null) {
                    m9Var2.h = walletuseraddress.address;
                }
                fi.w3 w3Var = m9Var2.f36243a;
                if (w3Var != null) {
                    w3Var.f37190f3.O(true);
                }
                m9Var2.C0();
                m9Var2.t0();
                q8 q8Var = m9Var2.f42840w;
                if (q8Var != null) {
                    q8Var.a(m9Var2.h, m9Var2.f42820f);
                    return;
                }
                return;
            case 3:
                m9 m9Var3 = this.f43446b;
                m9Var3.f42822g0 = (String) obj;
                m9Var3.f42823h0 = ((Boolean) obj2).booleanValue();
                m9Var3.P.setText(m9Var3.f42822g0);
                TextView textView = m9Var3.P;
                if (TextUtils.isEmpty(m9Var3.f42822g0)) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                textView.setVisibility(i7);
                m9Var3.E0();
                return;
            default:
                m9 m9Var4 = this.f43446b;
                m9Var4.f42822g0 = (String) obj;
                m9Var4.f42823h0 = ((Boolean) obj2).booleanValue();
                m9Var4.P.setText(m9Var4.f42822g0);
                TextView textView2 = m9Var4.P;
                if (TextUtils.isEmpty(m9Var4.f42822g0)) {
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
