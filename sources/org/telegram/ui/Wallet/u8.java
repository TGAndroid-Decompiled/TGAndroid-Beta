package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d71;
public final class u8 implements Utilities.Callback2 {
    public final int f35302a;
    public final j9 f35303b;

    public u8(j9 j9Var, int i10) {
        this.f35302a = i10;
        this.f35303b = j9Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f35302a) {
            case 0:
                String str = (String) obj2;
                j9.b0(this.f35303b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                j9 j9Var = this.f35303b;
                j9Var.getClass();
                if (wallettransaction != null) {
                    j9Var.f34660d0 = wallettransaction.fee;
                    j9Var.y0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                j9 j9Var2 = this.f35303b;
                j9Var2.f34670n = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    j9Var2.finishFragment();
                    return;
                }
                j9Var2.d = walletuseraddress;
                if (walletuseraddress != null) {
                    j9Var2.f34662f = walletuseraddress.address;
                }
                d71 d71Var = j9Var2.f25907a;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                }
                j9Var2.x0();
                j9Var2.o0();
                l8 l8Var = j9Var2.f34677s;
                if (l8Var != null) {
                    l8Var.a(j9Var2.f34662f, j9Var2.e);
                    return;
                }
                return;
            case 3:
                j9 j9Var3 = this.f35303b;
                j9Var3.f34663f0 = (String) obj;
                j9Var3.f34664g0 = ((Boolean) obj2).booleanValue();
                j9Var3.O.setText(j9Var3.f34663f0);
                TextView textView = j9Var3.O;
                if (TextUtils.isEmpty(j9Var3.f34663f0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                j9Var3.z0();
                return;
            default:
                j9 j9Var4 = this.f35303b;
                j9Var4.f34663f0 = (String) obj;
                j9Var4.f34664g0 = ((Boolean) obj2).booleanValue();
                j9Var4.O.setText(j9Var4.f34663f0);
                TextView textView2 = j9Var4.O;
                if (TextUtils.isEmpty(j9Var4.f34663f0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                j9Var4.z0();
                return;
        }
    }
}
