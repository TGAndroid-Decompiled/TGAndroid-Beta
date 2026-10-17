package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class tk implements Utilities.Callback2 {
    public final int f30650a;
    public final al f30651b;

    public tk(al alVar, int i10) {
        this.f30650a = i10;
        this.f30651b = alVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f30650a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                al alVar = this.f30651b;
                TLRPC.User user = alVar.f24635r;
                if (!alVar.H) {
                    alVar.F = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        alVar.G = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f20419id) {
                        alVar.f24646y = walletuseraddress.address;
                        alVar.E = walletuseraddress.public_key;
                    }
                    alVar.v.a(alVar.f24646y, user);
                    alVar.g0();
                    alVar.Y();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                al alVar2 = this.f30651b;
                if (!alVar2.H && wallettransaction != null) {
                    alVar2.f24621d0 = wallettransaction.fee;
                    alVar2.h0();
                    return;
                }
                return;
        }
    }
}
