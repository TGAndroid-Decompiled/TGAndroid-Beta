package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class x8 implements v10 {
    public final int f43363a;
    public final l9 f43364b;

    public x8(l9 l9Var, int i7) {
        this.f43363a = i7;
        this.f43364b = l9Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f43363a) {
            case 0:
                String str = (String) obj2;
                l9.g0(this.f43364b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                l9 l9Var = this.f43364b;
                l9Var.getClass();
                if (wallettransaction != null) {
                    l9Var.f42737e0 = wallettransaction.fee;
                    l9Var.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                l9 l9Var2 = this.f43364b;
                l9Var2.f42751r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    l9Var2.finishFragment();
                    return;
                }
                l9Var2.f42736e = walletuseraddress;
                if (walletuseraddress != null) {
                    l9Var2.h = walletuseraddress.address;
                }
                fi.w3 w3Var = l9Var2.f36649a;
                if (w3Var != null) {
                    w3Var.f37556f3.O(true);
                }
                l9Var2.C0();
                l9Var2.t0();
                p8 p8Var = l9Var2.f42758w;
                if (p8Var != null) {
                    p8Var.a(l9Var2.h, l9Var2.f42738f);
                    return;
                }
                return;
            case 3:
                l9 l9Var3 = this.f43364b;
                l9Var3.f42740g0 = (String) obj;
                l9Var3.f42741h0 = ((Boolean) obj2).booleanValue();
                l9Var3.P.setText(l9Var3.f42740g0);
                TextView textView = l9Var3.P;
                if (TextUtils.isEmpty(l9Var3.f42740g0)) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                textView.setVisibility(i7);
                l9Var3.E0();
                return;
            default:
                l9 l9Var4 = this.f43364b;
                l9Var4.f42740g0 = (String) obj;
                l9Var4.f42741h0 = ((Boolean) obj2).booleanValue();
                l9Var4.P.setText(l9Var4.f42740g0);
                TextView textView2 = l9Var4.P;
                if (TextUtils.isEmpty(l9Var4.f42740g0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView2.setVisibility(i10);
                l9Var4.E0();
                return;
        }
    }
}
