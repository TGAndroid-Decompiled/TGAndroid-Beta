package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class dk implements org.telegram.messenger.k20 {
    public final int f25505a;
    public final kk f25506b;

    public dk(kk kkVar, int i10) {
        this.f25505a = i10;
        this.f25506b = kkVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f25505a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                kk kkVar = this.f25506b;
                TLRPC.User user = kkVar.f27877r;
                if (!kkVar.K) {
                    kkVar.I = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        kkVar.J = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f19943id) {
                        kkVar.G = walletuseraddress.address;
                        kkVar.H = walletuseraddress.public_key;
                    }
                    kkVar.f27884w.a(kkVar.G, user);
                    kkVar.g0();
                    kkVar.Y();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                kk kkVar2 = this.f25506b;
                if (!kkVar2.K && wallettransaction != null) {
                    kkVar2.f27866g0 = wallettransaction.fee;
                    kkVar2.h0();
                    return;
                }
                return;
        }
    }
}
