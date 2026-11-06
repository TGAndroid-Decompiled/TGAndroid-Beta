package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class z8 implements v10 {
    public final int f43473a;
    public final n9 f43474b;

    public z8(n9 n9Var, int i7) {
        this.f43473a = i7;
        this.f43474b = n9Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f43473a) {
            case 0:
                String str = (String) obj2;
                n9.g0(this.f43474b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                n9 n9Var = this.f43474b;
                n9Var.getClass();
                if (wallettransaction != null) {
                    n9Var.f42849e0 = wallettransaction.fee;
                    n9Var.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                n9 n9Var2 = this.f43474b;
                n9Var2.f42863r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    n9Var2.finishFragment();
                    return;
                }
                n9Var2.f42848e = walletuseraddress;
                if (walletuseraddress != null) {
                    n9Var2.h = walletuseraddress.address;
                }
                fi.w3 w3Var = n9Var2.f36227a;
                if (w3Var != null) {
                    w3Var.f37160f3.O(true);
                }
                n9Var2.C0();
                n9Var2.t0();
                r8 r8Var = n9Var2.f42870w;
                if (r8Var != null) {
                    r8Var.a(n9Var2.h, n9Var2.f42850f);
                    return;
                }
                return;
            case 3:
                n9 n9Var3 = this.f43474b;
                n9Var3.f42852g0 = (String) obj;
                n9Var3.f42853h0 = ((Boolean) obj2).booleanValue();
                n9Var3.P.setText(n9Var3.f42852g0);
                TextView textView = n9Var3.P;
                if (TextUtils.isEmpty(n9Var3.f42852g0)) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                textView.setVisibility(i7);
                n9Var3.E0();
                return;
            default:
                n9 n9Var4 = this.f43474b;
                n9Var4.f42852g0 = (String) obj;
                n9Var4.f42853h0 = ((Boolean) obj2).booleanValue();
                n9Var4.P.setText(n9Var4.f42852g0);
                TextView textView2 = n9Var4.P;
                if (TextUtils.isEmpty(n9Var4.f42852g0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView2.setVisibility(i10);
                n9Var4.E0();
                return;
        }
    }
}
