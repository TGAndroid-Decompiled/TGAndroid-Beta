package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.k20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ii;
public final class e9 implements k20 {
    public final int f34468a;
    public final r9 f34469b;

    public e9(r9 r9Var, int i10) {
        this.f34468a = i10;
        this.f34469b = r9Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f34468a) {
            case 0:
                String str = (String) obj2;
                r9.g0(this.f34469b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                r9 r9Var = this.f34469b;
                r9Var.getClass();
                if (wallettransaction != null) {
                    r9Var.f35134e0 = wallettransaction.fee;
                    r9Var.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                r9 r9Var2 = this.f34469b;
                r9Var2.f35148r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    r9Var2.finishFragment();
                    return;
                }
                r9Var2.e = walletuseraddress;
                if (walletuseraddress != null) {
                    r9Var2.h = walletuseraddress.address;
                }
                ii iiVar = r9Var2.f30217a;
                if (iiVar != null) {
                    iiVar.f31183f3.O(true);
                }
                r9Var2.C0();
                r9Var2.t0();
                w8 w8Var = r9Var2.f35155w;
                if (w8Var != null) {
                    w8Var.a(r9Var2.h, r9Var2.f35135f);
                    return;
                }
                return;
            case 3:
                r9 r9Var3 = this.f34469b;
                r9Var3.f35137g0 = (String) obj;
                r9Var3.f35138h0 = ((Boolean) obj2).booleanValue();
                r9Var3.P.setText(r9Var3.f35137g0);
                TextView textView = r9Var3.P;
                if (TextUtils.isEmpty(r9Var3.f35137g0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                r9Var3.E0();
                return;
            default:
                r9 r9Var4 = this.f34469b;
                r9Var4.f35137g0 = (String) obj;
                r9Var4.f35138h0 = ((Boolean) obj2).booleanValue();
                r9Var4.P.setText(r9Var4.f35137g0);
                TextView textView2 = r9Var4.P;
                if (TextUtils.isEmpty(r9Var4.f35137g0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                r9Var4.E0();
                return;
        }
    }
}
