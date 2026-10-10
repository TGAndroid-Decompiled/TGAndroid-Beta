package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class yk implements Utilities.Callback2 {
    public final int f33323a;
    public final gl f33324b;

    public yk(gl glVar, int i10) {
        this.f33323a = i10;
        this.f33324b = glVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f33323a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                gl glVar = this.f33324b;
                TLRPC.User user = glVar.f26774r;
                if (!glVar.H) {
                    glVar.F = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        glVar.G = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f20189id) {
                        glVar.f26785y = walletuseraddress.address;
                        glVar.E = walletuseraddress.public_key;
                    }
                    glVar.v.a(glVar.f26785y, user);
                    glVar.g0();
                    glVar.Y();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                gl glVar2 = this.f33324b;
                if (!glVar2.H && wallettransaction != null) {
                    glVar2.f26760d0 = wallettransaction.fee;
                    glVar2.h0();
                    return;
                }
                return;
        }
    }
}
