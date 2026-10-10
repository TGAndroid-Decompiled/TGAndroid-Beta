package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f71;
public final class t7 implements Utilities.Callback2 {
    public final int f35581a;
    public final k8 f35582b;

    public t7(k8 k8Var, int i10) {
        this.f35581a = i10;
        this.f35582b = k8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f35581a) {
            case 0:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                k8 k8Var = this.f35582b;
                k8Var.getClass();
                if (wallettransaction != null) {
                    k8Var.f35201b0 = wallettransaction.fee;
                    k8Var.x0();
                    return;
                }
                return;
            case 1:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                k8 k8Var2 = this.f35582b;
                k8Var2.f35214n = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    k8Var2.finishFragment();
                    return;
                }
                k8Var2.d = walletuseraddress;
                if (walletuseraddress != null) {
                    k8Var2.f35206f = walletuseraddress.address;
                }
                f71 f71Var = k8Var2.f26629a;
                if (f71Var != null) {
                    f71Var.W2.N(true);
                }
                k8Var2.w0();
                k8Var2.n0();
                o7 o7Var = k8Var2.f35221s;
                if (o7Var != null) {
                    o7Var.a(k8Var2.f35206f, k8Var2.f35204e);
                    return;
                }
                return;
            case 2:
                k8 k8Var3 = this.f35582b;
                k8Var3.f35203d0 = (String) obj;
                k8Var3.f35205e0 = ((Boolean) obj2).booleanValue();
                k8Var3.M.setText(k8Var3.f35203d0);
                TextView textView = k8Var3.M;
                if (TextUtils.isEmpty(k8Var3.f35203d0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                k8Var3.y0();
                return;
            case 3:
                k8 k8Var4 = this.f35582b;
                k8Var4.f35203d0 = (String) obj;
                k8Var4.f35205e0 = ((Boolean) obj2).booleanValue();
                k8Var4.M.setText(k8Var4.f35203d0);
                TextView textView2 = k8Var4.M;
                if (TextUtils.isEmpty(k8Var4.f35203d0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                k8Var4.y0();
                return;
            default:
                String str2 = (String) obj2;
                k8.b0(this.f35582b, (TL_wallet.walletUserAddress) obj);
                return;
        }
    }
}
