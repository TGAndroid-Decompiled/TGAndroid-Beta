package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
public final class r7 implements Utilities.Callback2 {
    public final int f33659a;
    public final i8 f33660b;

    public r7(i8 i8Var, int i10) {
        this.f33659a = i10;
        this.f33660b = i8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f33659a) {
            case 0:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                i8 i8Var = this.f33660b;
                i8Var.getClass();
                if (wallettransaction != null) {
                    i8Var.f33294b0 = wallettransaction.fee;
                    i8Var.x0();
                    return;
                }
                return;
            case 1:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                i8 i8Var2 = this.f33660b;
                i8Var2.f33306n = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    i8Var2.finishFragment();
                    return;
                }
                i8Var2.d = walletuseraddress;
                if (walletuseraddress != null) {
                    i8Var2.f33298f = walletuseraddress.address;
                }
                b71 b71Var = i8Var2.f23964a;
                if (b71Var != null) {
                    b71Var.W2.N(true);
                }
                i8Var2.w0();
                i8Var2.n0();
                m7 m7Var = i8Var2.f33313s;
                if (m7Var != null) {
                    m7Var.a(i8Var2.f33298f, i8Var2.e);
                    return;
                }
                return;
            case 2:
                i8 i8Var3 = this.f33660b;
                i8Var3.f33296d0 = (String) obj;
                i8Var3.f33297e0 = ((Boolean) obj2).booleanValue();
                i8Var3.M.setText(i8Var3.f33296d0);
                TextView textView = i8Var3.M;
                if (TextUtils.isEmpty(i8Var3.f33296d0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                i8Var3.y0();
                return;
            case 3:
                i8 i8Var4 = this.f33660b;
                i8Var4.f33296d0 = (String) obj;
                i8Var4.f33297e0 = ((Boolean) obj2).booleanValue();
                i8Var4.M.setText(i8Var4.f33296d0);
                TextView textView2 = i8Var4.M;
                if (TextUtils.isEmpty(i8Var4.f33296d0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                i8Var4.y0();
                return;
            default:
                String str2 = (String) obj2;
                i8.b0(this.f33660b, (TL_wallet.walletUserAddress) obj);
                return;
        }
    }
}
