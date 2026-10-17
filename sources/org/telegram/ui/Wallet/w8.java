package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.u61;
public final class w8 implements Utilities.Callback2 {
    public final int f35102a;
    public final l9 f35103b;

    public w8(l9 l9Var, int i10) {
        this.f35102a = i10;
        this.f35103b = l9Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f35102a) {
            case 0:
                String str = (String) obj2;
                l9.b0(this.f35103b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                l9 l9Var = this.f35103b;
                l9Var.getClass();
                if (wallettransaction != null) {
                    l9Var.f34525b0 = wallettransaction.fee;
                    l9Var.x0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                l9 l9Var2 = this.f35103b;
                l9Var2.f34537n = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    l9Var2.finishFragment();
                    return;
                }
                l9Var2.d = walletuseraddress;
                if (walletuseraddress != null) {
                    l9Var2.f34529f = walletuseraddress.address;
                }
                u61 u61Var = l9Var2.f31190a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                }
                l9Var2.w0();
                l9Var2.n0();
                n8 n8Var = l9Var2.f34544s;
                if (n8Var != null) {
                    n8Var.a(l9Var2.f34529f, l9Var2.e);
                    return;
                }
                return;
            case 3:
                l9 l9Var3 = this.f35103b;
                l9Var3.f34527d0 = (String) obj;
                l9Var3.f34528e0 = ((Boolean) obj2).booleanValue();
                l9Var3.M.setText(l9Var3.f34527d0);
                TextView textView = l9Var3.M;
                if (TextUtils.isEmpty(l9Var3.f34527d0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                l9Var3.y0();
                return;
            default:
                l9 l9Var4 = this.f35103b;
                l9Var4.f34527d0 = (String) obj;
                l9Var4.f34528e0 = ((Boolean) obj2).booleanValue();
                l9Var4.M.setText(l9Var4.f34527d0);
                TextView textView2 = l9Var4.M;
                if (TextUtils.isEmpty(l9Var4.f34527d0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                l9Var4.y0();
                return;
        }
    }
}
