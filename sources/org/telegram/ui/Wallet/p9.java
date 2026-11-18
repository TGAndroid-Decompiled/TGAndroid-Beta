package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class p9 implements q10 {
    public final int f44799a;
    public final da f44800b;

    public p9(da daVar, int i7) {
        this.f44799a = i7;
        this.f44800b = daVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f44799a) {
            case 0:
                String str = (String) obj2;
                da.g0(this.f44800b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                da daVar = this.f44800b;
                daVar.getClass();
                if (wallettransaction != null) {
                    daVar.f44060f0 = wallettransaction.fee;
                    daVar.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                da daVar2 = this.f44800b;
                daVar2.f44072r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    daVar2.finishFragment();
                    return;
                }
                daVar2.f44057e = walletuseraddress;
                if (walletuseraddress != null) {
                    daVar2.h = walletuseraddress.address;
                }
                bi.c6 c6Var = daVar2.f33530a;
                if (c6Var != null) {
                    c6Var.f34607g3.O(true);
                }
                daVar2.C0();
                daVar2.t0();
                g9 g9Var = daVar2.f44079w;
                if (g9Var != null) {
                    g9Var.a(daVar2.h, daVar2.f44059f);
                    return;
                }
                return;
            case 3:
                da daVar3 = this.f44800b;
                daVar3.f44062h0 = (String) obj;
                daVar3.f44063i0 = ((Boolean) obj2).booleanValue();
                daVar3.Q.setText(daVar3.f44062h0);
                TextView textView = daVar3.Q;
                if (TextUtils.isEmpty(daVar3.f44062h0)) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                textView.setVisibility(i7);
                daVar3.E0();
                return;
            default:
                da daVar4 = this.f44800b;
                daVar4.f44062h0 = (String) obj;
                daVar4.f44063i0 = ((Boolean) obj2).booleanValue();
                daVar4.Q.setText(daVar4.f44062h0);
                TextView textView2 = daVar4.Q;
                if (TextUtils.isEmpty(daVar4.f44062h0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView2.setVisibility(i10);
                daVar4.E0();
                return;
        }
    }
}
