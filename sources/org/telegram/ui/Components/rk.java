package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class rk implements Utilities.Callback2 {
    public final int f30222a;
    public final yk f30223b;

    public rk(yk ykVar, int i10) {
        this.f30222a = i10;
        this.f30223b = ykVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f30222a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                yk ykVar = this.f30223b;
                TLRPC.User user = ykVar.f32959r;
                if (!ykVar.K) {
                    ykVar.I = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        ykVar.J = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f20491id) {
                        ykVar.G = walletuseraddress.address;
                        ykVar.H = walletuseraddress.public_key;
                    }
                    ykVar.v.a(ykVar.G, user);
                    ykVar.g0();
                    ykVar.Y();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                yk ykVar2 = this.f30223b;
                if (!ykVar2.K && wallettransaction != null) {
                    ykVar2.f32948g0 = wallettransaction.fee;
                    ykVar2.h0();
                    return;
                }
                return;
        }
    }
}
