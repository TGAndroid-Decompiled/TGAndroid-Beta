package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f71;
public final class u7 implements Utilities.Callback2 {
    public final int f35645a;
    public final l8 f35646b;

    public u7(l8 l8Var, int i10) {
        this.f35645a = i10;
        this.f35646b = l8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f35645a) {
            case 0:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                l8 l8Var = this.f35646b;
                l8Var.getClass();
                if (wallettransaction != null) {
                    l8Var.f35265b0 = wallettransaction.fee;
                    l8Var.x0();
                    return;
                }
                return;
            case 1:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                l8 l8Var2 = this.f35646b;
                l8Var2.f35278n = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    l8Var2.finishFragment();
                    return;
                }
                l8Var2.d = walletuseraddress;
                if (walletuseraddress != null) {
                    l8Var2.f35270f = walletuseraddress.address;
                }
                f71 f71Var = l8Var2.f26675a;
                if (f71Var != null) {
                    f71Var.W2.N(true);
                }
                l8Var2.w0();
                l8Var2.n0();
                p7 p7Var = l8Var2.f35285s;
                if (p7Var != null) {
                    p7Var.a(l8Var2.f35270f, l8Var2.f35268e);
                    return;
                }
                return;
            case 2:
                l8 l8Var3 = this.f35646b;
                l8Var3.f35267d0 = (String) obj;
                l8Var3.f35269e0 = ((Boolean) obj2).booleanValue();
                l8Var3.M.setText(l8Var3.f35267d0);
                TextView textView = l8Var3.M;
                if (TextUtils.isEmpty(l8Var3.f35267d0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                l8Var3.y0();
                return;
            case 3:
                l8 l8Var4 = this.f35646b;
                l8Var4.f35267d0 = (String) obj;
                l8Var4.f35269e0 = ((Boolean) obj2).booleanValue();
                l8Var4.M.setText(l8Var4.f35267d0);
                TextView textView2 = l8Var4.M;
                if (TextUtils.isEmpty(l8Var4.f35267d0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                l8Var4.y0();
                return;
            default:
                String str2 = (String) obj2;
                l8.b0(this.f35646b, (TL_wallet.walletUserAddress) obj);
                return;
        }
    }
}
