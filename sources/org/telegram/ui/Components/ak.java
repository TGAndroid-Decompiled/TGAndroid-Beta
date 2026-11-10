package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class ak implements org.telegram.messenger.v10 {
    public final int f31871a;
    public final hk f31872b;

    public ak(hk hkVar, int i7) {
        this.f31871a = i7;
        this.f31872b = hkVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f31871a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                hk hkVar = this.f31872b;
                TLRPC.User user = hkVar.f34385r;
                if (!hkVar.K) {
                    hkVar.I = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        hkVar.J = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f27109id) {
                        hkVar.G = walletuseraddress.address;
                        hkVar.H = walletuseraddress.public_key;
                    }
                    hkVar.f34392w.a(hkVar.G, user);
                    hkVar.i0();
                    hkVar.a0();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                hk hkVar2 = this.f31872b;
                if (!hkVar2.K && wallettransaction != null) {
                    hkVar2.f34374g0 = wallettransaction.fee;
                    hkVar2.j0();
                    return;
                }
                return;
        }
    }
}
