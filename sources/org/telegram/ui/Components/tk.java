package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class tk implements Utilities.Callback2 {
    public final int f33074a;
    public final al f33075b;

    public tk(al alVar, int i10) {
        this.f33074a = i10;
        this.f33075b = alVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f33074a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                al alVar = this.f33075b;
                TLRPC.User user = alVar.f26593r;
                if (!alVar.K) {
                    alVar.I = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        alVar.J = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f22177id) {
                        alVar.G = walletuseraddress.address;
                        alVar.H = walletuseraddress.public_key;
                    }
                    alVar.v.a(alVar.G, user);
                    alVar.g0();
                    alVar.Y();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                al alVar2 = this.f33075b;
                if (!alVar2.K && wallettransaction != null) {
                    alVar2.f26582g0 = wallettransaction.fee;
                    alVar2.h0();
                    return;
                }
                return;
        }
    }
}
