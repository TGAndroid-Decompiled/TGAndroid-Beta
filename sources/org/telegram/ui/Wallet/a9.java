package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class a9 implements v10 {
    public final int f42155a;
    public final o9 f42156b;

    public a9(o9 o9Var, int i7) {
        this.f42155a = i7;
        this.f42156b = o9Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f42155a) {
            case 0:
                String str = (String) obj2;
                o9.g0(this.f42156b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                o9 o9Var = this.f42156b;
                o9Var.getClass();
                if (wallettransaction != null) {
                    o9Var.f42921e0 = wallettransaction.fee;
                    o9Var.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                o9 o9Var2 = this.f42156b;
                o9Var2.f42935r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    o9Var2.finishFragment();
                    return;
                }
                o9Var2.f42920e = walletuseraddress;
                if (walletuseraddress != null) {
                    o9Var2.h = walletuseraddress.address;
                }
                fi.w3 w3Var = o9Var2.f36518a;
                if (w3Var != null) {
                    w3Var.f37496f3.O(true);
                }
                o9Var2.C0();
                o9Var2.t0();
                s8 s8Var = o9Var2.f42942w;
                if (s8Var != null) {
                    s8Var.a(o9Var2.h, o9Var2.f42922f);
                    return;
                }
                return;
            case 3:
                o9 o9Var3 = this.f42156b;
                o9Var3.f42924g0 = (String) obj;
                o9Var3.f42925h0 = ((Boolean) obj2).booleanValue();
                o9Var3.P.setText(o9Var3.f42924g0);
                TextView textView = o9Var3.P;
                if (TextUtils.isEmpty(o9Var3.f42924g0)) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                textView.setVisibility(i7);
                o9Var3.E0();
                return;
            default:
                o9 o9Var4 = this.f42156b;
                o9Var4.f42924g0 = (String) obj;
                o9Var4.f42925h0 = ((Boolean) obj2).booleanValue();
                o9Var4.P.setText(o9Var4.f42924g0);
                TextView textView2 = o9Var4.P;
                if (TextUtils.isEmpty(o9Var4.f42924g0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView2.setVisibility(i10);
                o9Var4.E0();
                return;
        }
    }
}
