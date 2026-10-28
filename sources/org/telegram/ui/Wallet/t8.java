package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m71;
public final class t8 implements Utilities.Callback2 {
    public final int f37359a;
    public final i9 f37360b;

    public t8(i9 i9Var, int i10) {
        this.f37359a = i10;
        this.f37360b = i9Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f37359a) {
            case 0:
                String str = (String) obj2;
                i9.c0(this.f37360b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                i9 i9Var = this.f37360b;
                i9Var.getClass();
                if (wallettransaction != null) {
                    i9Var.f36720e0 = wallettransaction.fee;
                    i9Var.z0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                i9 i9Var2 = this.f37360b;
                i9Var2.f36734r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    i9Var2.finishFragment();
                    return;
                }
                i9Var2.e = walletuseraddress;
                if (walletuseraddress != null) {
                    i9Var2.h = walletuseraddress.address;
                }
                m71 m71Var = i9Var2.f30764a;
                if (m71Var != null) {
                    m71Var.f32504g3.O(true);
                }
                i9Var2.y0();
                i9Var2.p0();
                k8 k8Var = i9Var2.v;
                if (k8Var != null) {
                    k8Var.a(i9Var2.h, i9Var2.f36721f);
                    return;
                }
                return;
            case 3:
                i9 i9Var3 = this.f37360b;
                i9Var3.f36723g0 = (String) obj;
                i9Var3.f36724h0 = ((Boolean) obj2).booleanValue();
                i9Var3.P.setText(i9Var3.f36723g0);
                TextView textView = i9Var3.P;
                if (TextUtils.isEmpty(i9Var3.f36723g0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                i9Var3.A0();
                return;
            default:
                i9 i9Var4 = this.f37360b;
                i9Var4.f36723g0 = (String) obj;
                i9Var4.f36724h0 = ((Boolean) obj2).booleanValue();
                i9Var4.P.setText(i9Var4.f36723g0);
                TextView textView2 = i9Var4.P;
                if (TextUtils.isEmpty(i9Var4.f36723g0)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                i9Var4.A0();
                return;
        }
    }
}
