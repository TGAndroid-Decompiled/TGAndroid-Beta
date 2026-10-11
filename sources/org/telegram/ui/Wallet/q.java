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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.g71;
public final class q implements Utilities.Callback {
    public final int f35467a;
    public final Object f35468b;
    public final Object f35469c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i10) {
        this.f35467a = i10;
        this.f35468b = obj;
        this.f35469c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        switch (this.f35467a) {
            case 0:
                l0 l0Var = (l0) this.f35468b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f35469c;
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
                f2 f2Var = (f2) this.f35468b;
                b2 b2Var = (b2) this.f35469c;
                ii.c cVar = (ii.c) this.d;
                String str3 = (String) obj;
                f2Var.getClass();
                if (!b2Var.f34721n && !f2Var.i(b2Var) && f2Var.y(b2Var) && str3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b2Var.f34723p = z10;
                cVar.run(null, str3);
                return;
            case 2:
                f2 f2Var2 = (f2) this.f35468b;
                b2 b2Var2 = (b2) this.f35469c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str4 = (String) obj;
                f2Var2.getClass();
                b2Var2.f34720m = false;
                if (b2Var2.f34725r == null && f2Var2.f34929g == b2Var2) {
                    f2Var2.f34929g = null;
                }
                callback.run(str4);
                return;
            case 3:
                f2 f2Var3 = (f2) this.f35468b;
                f2Var3.getClass();
                AndroidUtilities.runOnUIThread(new o6((Object) f2Var3, (Object) ((TL_wallet.tonConnectSession) this.f35469c), (String) obj, (Object) ((l) this.d), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f35468b;
                p3 p3Var = (p3) this.f35469c;
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
                k2[] k2VarArr = (k2[]) this.f35469c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                String str5 = (String) obj;
                ((ci.d) this.f35468b).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new ad(k2VarArr[0].topBulletinContainer, d6Var).e0(str5, false);
                    return;
                } else {
                    k2VarArr[0].dismiss();
                    return;
                }
            case 6:
                l0 l0Var2 = (l0) this.f35468b;
                l0Var2.h0(new org.telegram.messenger.camera.i((Object) l0Var2, (Object) new s((n7) this.f35469c, (Utilities.Callback) obj, (ArrayList) this.d, l0Var2), true, false, 2));
                return;
            case 7:
                u8 u8Var = (u8) this.f35469c;
                l0 l0Var3 = (l0) this.f35468b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str6 = (String) obj;
                if (!u8Var.f35649n) {
                    if (!TextUtils.isEmpty(str6) && l0.b(u8Var.f35647e, l0Var3.r())) {
                        b0 b0Var = new b0(l0Var3, str6, u8Var.d, null, new p(u8Var, l0Var3, user, str6));
                        l0Var3.h0(b0Var);
                        u8Var.h = new o(b0Var, 1);
                        return;
                    }
                    u8Var.f35648f = false;
                    u8Var.V.setLoading(false);
                    ad a02 = ad.a0(u8Var);
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
                ((org.telegram.ui.Cells.i6) ((View) obj)).u((TLRPC.User) this.f35468b, null, (CharSequence) this.f35469c, (CharSequence) this.d, false, false);
                return;
            default:
                k2 k2Var = (k2) this.f35469c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                String str7 = (String) obj;
                ((ci.d) this.f35468b).setLoading(false);
                if (str7 == null) {
                    k2Var.dismiss();
                    return;
                } else {
                    ad.c0(str7, k2Var.topBulletinContainer, d6Var2);
                    return;
                }
        }
    }

    public q(g71 g71Var, l0 l0Var, Object obj, int i10) {
        this.f35467a = i10;
        this.f35469c = g71Var;
        this.f35468b = l0Var;
        this.d = obj;
    }
}
