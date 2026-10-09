package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.e71;
public final class s7 implements Utilities.Callback2 {
    public final int f35488a;
    public final j8 f35489b;

    public s7(j8 j8Var, int i10) {
        this.f35488a = i10;
        this.f35489b = j8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f35488a) {
            case 0:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                j8 j8Var = this.f35489b;
                j8Var.getClass();
                if (wallettransaction != null) {
                    j8Var.f35090b0 = wallettransaction.fee;
                    j8Var.x0();
                    return;
                }
                return;
            case 1:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                j8 j8Var2 = this.f35489b;
                j8Var2.f35103n = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    j8Var2.finishFragment();
                    return;
                }
                j8Var2.d = walletuseraddress;
                if (walletuseraddress != null) {
                    j8Var2.f35095f = walletuseraddress.address;
                }
                e71 e71Var = j8Var2.f26290a;
                if (e71Var != null) {
                    e71Var.W2.N(true);
                }
                j8Var2.w0();
                j8Var2.n0();
                n7 n7Var = j8Var2.f35110s;
                if (n7Var != null) {
                    n7Var.a(j8Var2.f35095f, j8Var2.f35093e);
                    return;
                }
                return;
            case 2:
                j8 j8Var3 = this.f35489b;
                j8Var3.f35092d0 = (String) obj;
                j8Var3.f35094e0 = ((Boolean) obj2).booleanValue();
                j8Var3.M.setText(j8Var3.f35092d0);
                TextView textView = j8Var3.M;
                if (TextUtils.isEmpty(j8Var3.f35092d0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                j8Var3.y0();
                return;
            case 3:
                j8 j8Var4 = this.f35489b;
                j8Var4.f35092d0 = (String) obj;
                j8Var4.f35094e0 = ((Boolean) obj2).booleanValue();
                j8Var4.M.setText(j8Var4.f35092d0);
                TextView textView2 = j8Var4.M;
                if (TextUtils.isEmpty(j8Var4.f35092d0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                j8Var4.y0();
                return;
            default:
                String str2 = (String) obj2;
                j8.b0(this.f35489b, (TL_wallet.walletUserAddress) obj);
                return;
        }
    }
}
