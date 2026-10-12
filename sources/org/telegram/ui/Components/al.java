package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class al implements Utilities.Callback2 {
    public final int f24429a;
    public final il f24430b;

    public al(il ilVar, int i10) {
        this.f24429a = i10;
        this.f24430b = ilVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f24429a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                il ilVar = this.f24430b;
                TLRPC.User user = ilVar.f27209r;
                if (!ilVar.H) {
                    ilVar.F = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        ilVar.G = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f19949id) {
                        ilVar.f27220y = walletuseraddress.address;
                        ilVar.E = walletuseraddress.public_key;
                    }
                    ilVar.v.a(ilVar.f27220y, user);
                    ilVar.g0();
                    ilVar.Y();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                il ilVar2 = this.f24430b;
                if (!ilVar2.H && wallettransaction != null) {
                    ilVar2.f27195d0 = wallettransaction.fee;
                    ilVar2.h0();
                    return;
                }
                return;
        }
    }
}
