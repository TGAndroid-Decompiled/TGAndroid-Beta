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
public final class p implements Utilities.Callback {
    public final int f35403a;
    public final Object f35404b;
    public final Object f35405c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f35403a = i10;
        this.f35404b = obj;
        this.f35405c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        switch (this.f35403a) {
            case 0:
                k0 k0Var = (k0) this.f35404b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f35405c;
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
                e2 e2Var = (e2) this.f35404b;
                a2 a2Var = (a2) this.f35405c;
                ii.c cVar = (ii.c) this.d;
                String str3 = (String) obj;
                e2Var.getClass();
                if (!a2Var.f34659n && !e2Var.i(a2Var) && e2Var.y(a2Var) && str3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a2Var.f34661p = z10;
                cVar.run(null, str3);
                return;
            case 2:
                e2 e2Var2 = (e2) this.f35404b;
                a2 a2Var2 = (a2) this.f35405c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str4 = (String) obj;
                e2Var2.getClass();
                a2Var2.f34658m = false;
                if (a2Var2.f34663r == null && e2Var2.f34863g == a2Var2) {
                    e2Var2.f34863g = null;
                }
                callback.run(str4);
                return;
            case 3:
                e2 e2Var3 = (e2) this.f35404b;
                e2Var3.getClass();
                AndroidUtilities.runOnUIThread(new n6((Object) e2Var3, (Object) ((TL_wallet.tonConnectSession) this.f35405c), (String) obj, (Object) ((k) this.d), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f35404b;
                o3 o3Var = (o3) this.f35405c;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    o3Var.run(wallettransaction2);
                    return;
                }
                return;
            case 5:
                j2[] j2VarArr = (j2[]) this.f35405c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                String str5 = (String) obj;
                ((ci.d) this.f35404b).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new ad(j2VarArr[0].topBulletinContainer, e6Var).e0(str5, false);
                    return;
                } else {
                    j2VarArr[0].dismiss();
                    return;
                }
            case 6:
                k0 k0Var2 = (k0) this.f35404b;
                k0Var2.h0(new org.telegram.messenger.camera.i((Object) k0Var2, (Object) new r((m7) this.f35405c, (Utilities.Callback) obj, (ArrayList) this.d, k0Var2), true, false, 2));
                return;
            case 7:
                t8 t8Var = (t8) this.f35405c;
                k0 k0Var3 = (k0) this.f35404b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str6 = (String) obj;
                if (!t8Var.f35585n) {
                    if (!TextUtils.isEmpty(str6) && k0.b(t8Var.f35583e, k0Var3.r())) {
                        a0 a0Var = new a0(k0Var3, str6, t8Var.d, null, new o(t8Var, k0Var3, user, str6));
                        k0Var3.h0(a0Var);
                        t8Var.h = new n(a0Var, 1);
                        return;
                    }
                    t8Var.f35584f = false;
                    t8Var.V.setLoading(false);
                    ad a02 = ad.a0(t8Var);
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
                ((org.telegram.ui.Cells.i6) ((View) obj)).u((TLRPC.User) this.f35404b, null, (CharSequence) this.f35405c, (CharSequence) this.d, false, false);
                return;
            default:
                j2 j2Var = (j2) this.f35405c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                String str7 = (String) obj;
                ((ci.d) this.f35404b).setLoading(false);
                if (str7 == null) {
                    j2Var.dismiss();
                    return;
                } else {
                    ad.c0(str7, j2Var.topBulletinContainer, e6Var2);
                    return;
                }
        }
    }

    public p(g71 g71Var, k0 k0Var, Object obj, int i10) {
        this.f35403a = i10;
        this.f35405c = g71Var;
        this.f35404b = k0Var;
        this.d = obj;
    }
}
