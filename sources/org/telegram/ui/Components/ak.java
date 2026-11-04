package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class ak implements org.telegram.messenger.n10 {
    public final int f31861a;
    public final hk f31862b;

    public ak(hk hkVar, int i3) {
        this.f31861a = i3;
        this.f31862b = hkVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f31861a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                hk hkVar = this.f31862b;
                TLRPC.User user = hkVar.f34421r;
                if (!hkVar.L) {
                    hkVar.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        hkVar.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f27150id) {
                        hkVar.H = walletuseraddress.address;
                        hkVar.I = walletuseraddress.public_key;
                    }
                    hkVar.f34428w.a(hkVar.H, user);
                    hkVar.i0();
                    hkVar.a0();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                hk hkVar2 = this.f31862b;
                if (!hkVar2.L && wallettransaction != null) {
                    hkVar2.f34411h0 = wallettransaction.fee;
                    hkVar2.j0();
                    return;
                }
                return;
        }
    }
}
