package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.u61;
public final class t8 implements Utilities.Callback2 {
    public final int f34952a;
    public final i9 f34953b;

    public t8(i9 i9Var, int i10) {
        this.f34952a = i10;
        this.f34953b = i9Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f34952a) {
            case 0:
                String str = (String) obj2;
                i9.b0(this.f34953b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                i9 i9Var = this.f34953b;
                i9Var.getClass();
                if (wallettransaction != null) {
                    i9Var.f34318b0 = wallettransaction.fee;
                    i9Var.x0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                i9 i9Var2 = this.f34953b;
                i9Var2.f34330n = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    i9Var2.finishFragment();
                    return;
                }
                i9Var2.d = walletuseraddress;
                if (walletuseraddress != null) {
                    i9Var2.f34322f = walletuseraddress.address;
                }
                u61 u61Var = i9Var2.f31190a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                }
                i9Var2.w0();
                i9Var2.n0();
                k8 k8Var = i9Var2.f34337s;
                if (k8Var != null) {
                    k8Var.a(i9Var2.f34322f, i9Var2.e);
                    return;
                }
                return;
            case 3:
                i9 i9Var3 = this.f34953b;
                i9Var3.f34320d0 = (String) obj;
                i9Var3.f34321e0 = ((Boolean) obj2).booleanValue();
                i9Var3.M.setText(i9Var3.f34320d0);
                TextView textView = i9Var3.M;
                if (TextUtils.isEmpty(i9Var3.f34320d0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                i9Var3.y0();
                return;
            default:
                i9 i9Var4 = this.f34953b;
                i9Var4.f34320d0 = (String) obj;
                i9Var4.f34321e0 = ((Boolean) obj2).booleanValue();
                i9Var4.M.setText(i9Var4.f34320d0);
                TextView textView2 = i9Var4.M;
                if (TextUtils.isEmpty(i9Var4.f34320d0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                i9Var4.y0();
                return;
        }
    }
}
