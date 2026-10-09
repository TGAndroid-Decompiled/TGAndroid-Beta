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
import org.telegram.ui.Components.f71;
public final class o implements Utilities.Callback {
    public final int f35315a;
    public final Object f35316b;
    public final Object f35317c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f35315a = i10;
        this.f35316b = obj;
        this.f35317c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        switch (this.f35315a) {
            case 0:
                k0 k0Var = (k0) this.f35316b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f35317c;
                String str2 = (String) this.d;
                byte[] bArr = (byte[]) obj;
                k0Var.getClass();
                if (bArr == null) {
                    callback2.run(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                k0Var.I.put(str2, walletuseraddress);
                callback2.run(walletuseraddress, null);
                return;
            case 1:
                d2 d2Var = (d2) this.f35316b;
                z1 z1Var = (z1) this.f35317c;
                ii.c cVar = (ii.c) this.d;
                String str3 = (String) obj;
                d2Var.getClass();
                if (!z1Var.f35731n && !d2Var.i(z1Var) && d2Var.y(z1Var) && str3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z1Var.f35733p = z10;
                cVar.run(null, str3);
                return;
            case 2:
                d2 d2Var2 = (d2) this.f35316b;
                z1 z1Var2 = (z1) this.f35317c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str4 = (String) obj;
                d2Var2.getClass();
                z1Var2.f35730m = false;
                if (z1Var2.f35735r == null && d2Var2.f34772g == z1Var2) {
                    d2Var2.f34772g = null;
                }
                callback.run(str4);
                return;
            case 3:
                d2 d2Var3 = (d2) this.f35316b;
                d2Var3.getClass();
                AndroidUtilities.runOnUIThread(new m6((Object) d2Var3, (Object) ((TL_wallet.tonConnectSession) this.f35317c), (String) obj, (Object) ((j) this.d), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f35316b;
                n3 n3Var = (n3) this.f35317c;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    n3Var.run(wallettransaction2);
                    return;
                }
                return;
            case 5:
                i2[] i2VarArr = (i2[]) this.f35317c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                String str5 = (String) obj;
                ((ci.d) this.f35316b).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new ad(i2VarArr[0].topBulletinContainer, e6Var).e0(str5, false);
                    return;
                } else {
                    i2VarArr[0].dismiss();
                    return;
                }
            case 6:
                k0 k0Var2 = (k0) this.f35316b;
                k0Var2.h0(new org.telegram.messenger.camera.i((Object) k0Var2, (Object) new q((l7) this.f35317c, (Utilities.Callback) obj, (ArrayList) this.d, k0Var2), true, false, 2));
                return;
            case 7:
                s8 s8Var = (s8) this.f35317c;
                k0 k0Var3 = (k0) this.f35316b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str6 = (String) obj;
                if (!s8Var.f35492n) {
                    if (!TextUtils.isEmpty(str6) && k0.b(s8Var.f35490e, k0Var3.r())) {
                        a0 a0Var = new a0(k0Var3, str6, s8Var.d, null, new n(s8Var, k0Var3, user, str6));
                        k0Var3.h0(a0Var);
                        s8Var.h = new m(a0Var, 1);
                        return;
                    }
                    s8Var.f35491f = false;
                    s8Var.V.setLoading(false);
                    ad a02 = ad.a0(s8Var);
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
                ((org.telegram.ui.Cells.i6) ((View) obj)).u((TLRPC.User) this.f35316b, null, (CharSequence) this.f35317c, (CharSequence) this.d, false, false);
                return;
            default:
                i2 i2Var = (i2) this.f35317c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                String str7 = (String) obj;
                ((ci.d) this.f35316b).setLoading(false);
                if (str7 == null) {
                    i2Var.dismiss();
                    return;
                } else {
                    ad.c0(str7, i2Var.topBulletinContainer, e6Var2);
                    return;
                }
        }
    }

    public o(f71 f71Var, k0 k0Var, Object obj, int i10) {
        this.f35315a = i10;
        this.f35317c = f71Var;
        this.f35316b = k0Var;
        this.d = obj;
    }
}
