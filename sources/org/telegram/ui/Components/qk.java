package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class qk implements org.telegram.messenger.q10 {
    public final int f38818a;
    public final xk f38819b;

    public qk(xk xkVar, int i7) {
        this.f38818a = i7;
        this.f38819b = xkVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f38818a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                xk xkVar = this.f38819b;
                TLRPC.User user = xkVar.f42123r;
                if (!xkVar.L) {
                    xkVar.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        xkVar.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f28552id) {
                        xkVar.H = walletuseraddress.address;
                        xkVar.I = walletuseraddress.public_key;
                    }
                    xkVar.f42130w.a(xkVar.H, user);
                    xkVar.i0();
                    xkVar.a0();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                xk xkVar2 = this.f38819b;
                if (!xkVar2.L && wallettransaction != null) {
                    xkVar2.f42113h0 = wallettransaction.fee;
                    xkVar2.j0();
                    return;
                }
                return;
        }
    }
}
