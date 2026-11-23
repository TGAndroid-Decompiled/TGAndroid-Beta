package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class sk implements org.telegram.messenger.r10 {
    public final int f39562a;
    public final zk f39563b;

    public sk(zk zkVar, int i7) {
        this.f39562a = i7;
        this.f39563b = zkVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f39562a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                zk zkVar = this.f39563b;
                TLRPC.User user = zkVar.f42879r;
                if (!zkVar.L) {
                    zkVar.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        zkVar.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.f28547id) {
                        zkVar.H = walletuseraddress.address;
                        zkVar.I = walletuseraddress.public_key;
                    }
                    zkVar.f42886w.a(zkVar.H, user);
                    zkVar.i0();
                    zkVar.a0();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                zk zkVar2 = this.f39563b;
                if (!zkVar2.L && wallettransaction != null) {
                    zkVar2.f42869h0 = wallettransaction.fee;
                    zkVar2.j0();
                    return;
                }
                return;
        }
    }
}
