package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ii;
public final class e9 implements j20 {
    public final int f34470a;
    public final r9 f34471b;

    public e9(r9 r9Var, int i10) {
        this.f34470a = i10;
        this.f34471b = r9Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f34470a) {
            case 0:
                String str = (String) obj2;
                r9.f0(this.f34471b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                r9 r9Var = this.f34471b;
                r9Var.getClass();
                if (wallettransaction != null) {
                    r9Var.f35129e0 = wallettransaction.fee;
                    r9Var.C0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                r9 r9Var2 = this.f34471b;
                r9Var2.f35143r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    r9Var2.finishFragment();
                    return;
                }
                r9Var2.e = walletuseraddress;
                if (walletuseraddress != null) {
                    r9Var2.h = walletuseraddress.address;
                }
                ii iiVar = r9Var2.f29837a;
                if (iiVar != null) {
                    iiVar.f30819f3.O(true);
                }
                r9Var2.B0();
                r9Var2.s0();
                w8 w8Var = r9Var2.f35150w;
                if (w8Var != null) {
                    w8Var.a(r9Var2.h, r9Var2.f35130f);
                    return;
                }
                return;
            case 3:
                r9 r9Var3 = this.f34471b;
                r9Var3.f35132g0 = (String) obj;
                r9Var3.f35133h0 = ((Boolean) obj2).booleanValue();
                r9Var3.P.setText(r9Var3.f35132g0);
                TextView textView = r9Var3.P;
                if (TextUtils.isEmpty(r9Var3.f35132g0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                r9Var3.D0();
                return;
            default:
                r9 r9Var4 = this.f34471b;
                r9Var4.f35132g0 = (String) obj;
                r9Var4.f35133h0 = ((Boolean) obj2).booleanValue();
                r9Var4.P.setText(r9Var4.f35132g0);
                TextView textView2 = r9Var4.P;
                if (TextUtils.isEmpty(r9Var4.f35132g0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                r9Var4.D0();
                return;
        }
    }
}
