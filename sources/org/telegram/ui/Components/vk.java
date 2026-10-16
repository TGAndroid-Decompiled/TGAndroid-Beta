package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class vk implements Utilities.Callback2 {
    public final int f29745a;
    public final cl f29746b;

    public vk(cl clVar, int i10) {
        this.f29745a = i10;
        this.f29746b = clVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f29745a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                cl clVar = this.f29746b;
                TLRPC.User user = clVar.f23787r;
                if (!clVar.H) {
                    clVar.F = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        clVar.G = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f19063id) {
                        clVar.f23798y = walletuseraddress.address;
                        clVar.E = walletuseraddress.public_key;
                    }
                    clVar.v.a(clVar.f23798y, user);
                    clVar.g0();
                    clVar.Y();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                cl clVar2 = this.f29746b;
                if (!clVar2.H && wallettransaction != null) {
                    clVar2.f23773d0 = wallettransaction.fee;
                    clVar2.h0();
                    return;
                }
                return;
        }
    }
}
