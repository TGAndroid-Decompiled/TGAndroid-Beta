package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class jk implements org.telegram.messenger.s10 {
    public final int f36021a;
    public final qk f36022b;

    public jk(qk qkVar, int i7) {
        this.f36021a = i7;
        this.f36022b = qkVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f36021a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                qk qkVar = this.f36022b;
                TLRPC.User user = qkVar.f38683r;
                if (!qkVar.L) {
                    qkVar.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        qkVar.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f28200id) {
                        qkVar.H = walletuseraddress.address;
                        qkVar.I = walletuseraddress.public_key;
                    }
                    qkVar.f38690w.a(qkVar.H, user);
                    qkVar.i0();
                    qkVar.a0();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                qk qkVar2 = this.f36022b;
                if (!qkVar2.L && wallettransaction != null) {
                    qkVar2.f38673h0 = wallettransaction.fee;
                    qkVar2.j0();
                    return;
                }
                return;
        }
    }
}
