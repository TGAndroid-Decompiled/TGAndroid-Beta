package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class wk implements Utilities.Callback2 {
    public final int f30908a;
    public final dl f30909b;

    public wk(dl dlVar, int i10) {
        this.f30908a = i10;
        this.f30909b = dlVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f30908a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                dl dlVar = this.f30909b;
                TLRPC.User user = dlVar.f24432r;
                if (!dlVar.H) {
                    dlVar.F = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        dlVar.G = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f19363id) {
                        dlVar.f24443y = walletuseraddress.address;
                        dlVar.E = walletuseraddress.public_key;
                    }
                    dlVar.v.a(dlVar.f24443y, user);
                    dlVar.g0();
                    dlVar.Y();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                dl dlVar2 = this.f30909b;
                if (!dlVar2.H && wallettransaction != null) {
                    dlVar2.f24418d0 = wallettransaction.fee;
                    dlVar2.h0();
                    return;
                }
                return;
        }
    }
}
