package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_wallet;
public final class a9 implements s10 {
    public final int f43486a;
    public final p9 f43487b;

    public a9(p9 p9Var, int i7) {
        this.f43486a = i7;
        this.f43487b = p9Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f43486a) {
            case 0:
                String str = (String) obj2;
                p9.g0(this.f43487b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                p9 p9Var = this.f43487b;
                p9Var.getClass();
                if (wallettransaction != null) {
                    p9Var.f44340f0 = wallettransaction.fee;
                    p9Var.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                p9 p9Var2 = this.f43487b;
                p9Var2.f44352r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    p9Var2.finishFragment();
                    return;
                }
                p9Var2.f44337e = walletuseraddress;
                if (walletuseraddress != null) {
                    p9Var2.h = walletuseraddress.address;
                }
                bi.v3 v3Var = p9Var2.f38880a;
                if (v3Var != null) {
                    v3Var.f39892g3.O(true);
                }
                p9Var2.C0();
                p9Var2.t0();
                s8 s8Var = p9Var2.f44359w;
                if (s8Var != null) {
                    s8Var.a(p9Var2.h, p9Var2.f44339f);
                    return;
                }
                return;
            case 3:
                p9 p9Var3 = this.f43487b;
                p9Var3.f44342h0 = (String) obj;
                p9Var3.f44343i0 = ((Boolean) obj2).booleanValue();
                p9Var3.Q.setText(p9Var3.f44342h0);
                TextView textView = p9Var3.Q;
                if (TextUtils.isEmpty(p9Var3.f44342h0)) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                textView.setVisibility(i7);
                p9Var3.E0();
                return;
            default:
                p9 p9Var4 = this.f43487b;
                p9Var4.f44342h0 = (String) obj;
                p9Var4.f44343i0 = ((Boolean) obj2).booleanValue();
                p9Var4.Q.setText(p9Var4.f44342h0);
                TextView textView2 = p9Var4.Q;
                if (TextUtils.isEmpty(p9Var4.f44342h0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView2.setVisibility(i10);
                p9Var4.E0();
                return;
        }
    }
}
