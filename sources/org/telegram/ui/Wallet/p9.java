package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class p9 implements q10 {
    public final int f44839a;
    public final da f44840b;

    public p9(da daVar, int i7) {
        this.f44839a = i7;
        this.f44840b = daVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f44839a) {
            case 0:
                String str = (String) obj2;
                da.g0(this.f44840b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                da daVar = this.f44840b;
                daVar.getClass();
                if (wallettransaction != null) {
                    daVar.f44100f0 = wallettransaction.fee;
                    daVar.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                da daVar2 = this.f44840b;
                daVar2.f44112r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    daVar2.finishFragment();
                    return;
                }
                daVar2.f44097e = walletuseraddress;
                if (walletuseraddress != null) {
                    daVar2.h = walletuseraddress.address;
                }
                bi.g6 g6Var = daVar2.f34683a;
                if (g6Var != null) {
                    g6Var.f35796g3.O(true);
                }
                daVar2.C0();
                daVar2.t0();
                g9 g9Var = daVar2.f44119w;
                if (g9Var != null) {
                    g9Var.a(daVar2.h, daVar2.f44099f);
                    return;
                }
                return;
            case 3:
                da daVar3 = this.f44840b;
                daVar3.f44102h0 = (String) obj;
                daVar3.f44103i0 = ((Boolean) obj2).booleanValue();
                daVar3.Q.setText(daVar3.f44102h0);
                TextView textView = daVar3.Q;
                if (TextUtils.isEmpty(daVar3.f44102h0)) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                textView.setVisibility(i7);
                daVar3.E0();
                return;
            default:
                da daVar4 = this.f44840b;
                daVar4.f44102h0 = (String) obj;
                daVar4.f44103i0 = ((Boolean) obj2).booleanValue();
                daVar4.Q.setText(daVar4.f44102h0);
                TextView textView2 = daVar4.Q;
                if (TextUtils.isEmpty(daVar4.f44102h0)) {
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
