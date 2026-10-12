package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.zc;
public final class p implements Utilities.Callback {
    public final int f35192a;
    public final Object f35193b;
    public final Object f35194c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f35192a = i10;
        this.f35193b = obj;
        this.f35194c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        switch (this.f35192a) {
            case 0:
                l0 l0Var = (l0) this.f35193b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f35194c;
                String str2 = (String) this.d;
                byte[] bArr = (byte[]) obj;
                l0Var.getClass();
                if (bArr == null) {
                    callback2.run(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                l0Var.I.put(str2, walletuseraddress);
                callback2.run(walletuseraddress, null);
                return;
            case 1:
                f2 f2Var = (f2) this.f35193b;
                b2 b2Var = (b2) this.f35194c;
                ii.c cVar = (ii.c) this.d;
                String str3 = (String) obj;
                f2Var.getClass();
                if (!b2Var.f34496n && !f2Var.i(b2Var) && f2Var.y(b2Var) && str3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b2Var.f34498p = z10;
                cVar.run(null, str3);
                return;
            case 2:
                f2 f2Var2 = (f2) this.f35193b;
                b2 b2Var2 = (b2) this.f35194c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str4 = (String) obj;
                f2Var2.getClass();
                b2Var2.f34495m = false;
                if (b2Var2.f34500r == null && f2Var2.f34704g == b2Var2) {
                    f2Var2.f34704g = null;
                }
                callback.run(str4);
                return;
            case 3:
                f2 f2Var3 = (f2) this.f35193b;
                f2Var3.getClass();
                AndroidUtilities.runOnUIThread(new o6((Object) f2Var3, (Object) ((TL_wallet.tonConnectSession) this.f35194c), (String) obj, (Object) ((k) this.d), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f35193b;
                p3 p3Var = (p3) this.f35194c;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    p3Var.run(wallettransaction2);
                    return;
                }
                return;
            case 5:
                k2[] k2VarArr = (k2[]) this.f35194c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                String str5 = (String) obj;
                ((ci.d) this.f35193b).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new zc(k2VarArr[0].topBulletinContainer, c6Var).e0(str5, false);
                    return;
                } else {
                    k2VarArr[0].dismiss();
                    return;
                }
            case 6:
                l0 l0Var2 = (l0) this.f35193b;
                l0Var2.h0(new org.telegram.messenger.camera.i((Object) l0Var2, (Object) new r((n7) this.f35194c, (Utilities.Callback) obj, (ArrayList) this.d, l0Var2), true, false, 2));
                return;
            case 7:
                u8 u8Var = (u8) this.f35194c;
                l0 l0Var3 = (l0) this.f35193b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str6 = (String) obj;
                if (!u8Var.f35425n) {
                    if (!TextUtils.isEmpty(str6) && l0.b(u8Var.f35423e, l0Var3.r())) {
                        b0 b0Var = new b0(l0Var3, str6, u8Var.d, null, new o(u8Var, l0Var3, user, str6));
                        l0Var3.h0(b0Var);
                        u8Var.h = new n(b0Var, 1);
                        return;
                    }
                    u8Var.f35424f = false;
                    u8Var.V.setLoading(false);
                    zc a02 = zc.a0(u8Var);
                    if (TextUtils.isEmpty(str6)) {
                        str = LocaleController.getString(R.string.WalletRecipientUnavailable);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    a02.e0(str, false);
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Cells.i6) ((View) obj)).u((TLRPC.User) this.f35193b, null, (CharSequence) this.f35194c, (CharSequence) this.d, false, false);
                return;
            default:
                k2 k2Var = (k2) this.f35194c;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.d;
                String str7 = (String) obj;
                ((ci.d) this.f35193b).setLoading(false);
                if (str7 == null) {
                    k2Var.dismiss();
                    return;
                } else {
                    zc.c0(str7, k2Var.topBulletinContainer, c6Var2);
                    return;
                }
        }
    }

    public p(k71 k71Var, l0 l0Var, Object obj, int i10) {
        this.f35192a = i10;
        this.f35194c = k71Var;
        this.f35193b = l0Var;
        this.d = obj;
    }
}
