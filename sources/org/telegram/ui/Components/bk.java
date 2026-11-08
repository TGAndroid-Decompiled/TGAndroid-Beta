package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class bk implements org.telegram.messenger.v10 {
    public final int f32212a;
    public final ik f32213b;

    public bk(ik ikVar, int i7) {
        this.f32212a = i7;
        this.f32213b = ikVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f32212a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                ik ikVar = this.f32213b;
                TLRPC.User user = ikVar.f34747r;
                if (!ikVar.K) {
                    ikVar.I = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        ikVar.J = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f27105id) {
                        ikVar.G = walletuseraddress.address;
                        ikVar.H = walletuseraddress.public_key;
                    }
                    ikVar.f34754w.a(ikVar.G, user);
                    ikVar.i0();
                    ikVar.a0();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                ik ikVar2 = this.f32213b;
                if (!ikVar2.K && wallettransaction != null) {
                    ikVar2.f34736g0 = wallettransaction.fee;
                    ikVar2.j0();
                    return;
                }
                return;
        }
    }
}
