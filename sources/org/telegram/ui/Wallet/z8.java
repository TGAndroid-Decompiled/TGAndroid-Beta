package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.u61;
public final class z8 implements Utilities.Callback2 {
    public final int f35238a;
    public final o9 f35239b;

    public z8(o9 o9Var, int i10) {
        this.f35238a = i10;
        this.f35239b = o9Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f35238a) {
            case 0:
                String str = (String) obj2;
                o9.b0(this.f35239b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                o9 o9Var = this.f35239b;
                o9Var.getClass();
                if (wallettransaction != null) {
                    o9Var.f34690b0 = wallettransaction.fee;
                    o9Var.x0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                o9 o9Var2 = this.f35239b;
                o9Var2.f34702n = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    o9Var2.finishFragment();
                    return;
                }
                o9Var2.d = walletuseraddress;
                if (walletuseraddress != null) {
                    o9Var2.f34694f = walletuseraddress.address;
                }
                u61 u61Var = o9Var2.f31197a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                }
                o9Var2.w0();
                o9Var2.n0();
                q8 q8Var = o9Var2.f34709s;
                if (q8Var != null) {
                    q8Var.a(o9Var2.f34694f, o9Var2.e);
                    return;
                }
                return;
            case 3:
                o9 o9Var3 = this.f35239b;
                o9Var3.f34692d0 = (String) obj;
                o9Var3.f34693e0 = ((Boolean) obj2).booleanValue();
                o9Var3.M.setText(o9Var3.f34692d0);
                TextView textView = o9Var3.M;
                if (TextUtils.isEmpty(o9Var3.f34692d0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                o9Var3.y0();
                return;
            default:
                o9 o9Var4 = this.f35239b;
                o9Var4.f34692d0 = (String) obj;
                o9Var4.f34693e0 = ((Boolean) obj2).booleanValue();
                o9Var4.M.setText(o9Var4.f34692d0);
                TextView textView2 = o9Var4.M;
                if (TextUtils.isEmpty(o9Var4.f34692d0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                o9Var4.y0();
                return;
        }
    }
}
