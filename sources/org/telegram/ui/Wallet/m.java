package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
public final class m implements c20 {
    public final int f42752a;
    public final Object f42753b;
    public final Object f42754c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f42752a = i7;
        this.f42753b = obj;
        this.f42754c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        String str;
        int i7 = this.f42752a;
        boolean z9 = true;
        Object obj2 = this.d;
        Object obj3 = this.f42754c;
        Object obj4 = this.f42753b;
        switch (i7) {
            case 0:
                n0 n0Var = (n0) obj4;
                v10 v10Var = (v10) obj3;
                String str2 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                n0Var.getClass();
                if (bArr == null) {
                    v10Var.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                n0Var.M.put(str2, walletuseraddress);
                v10Var.a(walletuseraddress, null);
                return;
            case 1:
                f2 f2Var = (f2) obj4;
                b2 b2Var = (b2) obj3;
                li.c cVar = (li.c) obj2;
                String str3 = (String) obj;
                f2Var.getClass();
                if (b2Var.f42133n || f2Var.j(b2Var) || !f2Var.A(b2Var) || str3 != null) {
                    z9 = false;
                }
                b2Var.f42135p = z9;
                cVar.a(null, str3);
                return;
            case 2:
                f2 f2Var2 = (f2) obj4;
                b2 b2Var2 = (b2) obj3;
                c20 c20Var = (c20) obj2;
                String str4 = (String) obj;
                f2Var2.getClass();
                b2Var2.f42132m = false;
                if (b2Var2.f42137r == null && f2Var2.f42465g == b2Var2) {
                    f2Var2.f42465g = null;
                }
                c20Var.a(str4);
                return;
            case 3:
                f2 f2Var3 = (f2) obj4;
                f2Var3.getClass();
                org.telegram.messenger.g0.h3(new g7((Object) f2Var3, (Object) ((TL_wallet.tonConnectSession) obj3), (String) obj, (Object) ((k) obj2), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                di.r rVar = (di.r) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    rVar.a(wallettransaction2);
                    return;
                }
                return;
            case 5:
                a3[] a3VarArr = (a3[]) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                String str5 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new hc(a3VarArr[0].E, f6Var).e0(str5, false);
                    return;
                } else {
                    a3VarArr[0].dismiss();
                    return;
                }
            case 6:
                o8.d0((o8) obj4, (c20) obj3, (r0) obj2, (k0) obj);
                return;
            case 7:
                x9 x9Var = (x9) obj3;
                n0 n0Var2 = (n0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                if (!x9Var.f43344r) {
                    if (!TextUtils.isEmpty(str6) && n0.b(x9Var.f43342f, n0Var2.t())) {
                        d0 d0Var = new d0(n0Var2, str6, x9Var.f43341e, null, new r(x9Var, n0Var2, user, str6));
                        n0Var2.m0(d0Var);
                        x9Var.f43343n = new l(d0Var, 1);
                        return;
                    }
                    x9Var.h = false;
                    x9Var.Z.setLoading(false);
                    hc a02 = hc.a0(x9Var);
                    if (TextUtils.isEmpty(str6)) {
                        str = hd.M0(2131743040, null);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    a02.e0(str, false);
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Cells.g6) ((View) obj)).x((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                return;
            default:
                a3 a3Var = (a3) obj3;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                String str7 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (str7 == null) {
                    a3Var.dismiss();
                    return;
                } else {
                    hc.c0(str7, a3Var.E, f6Var2);
                    return;
                }
        }
    }

    public m(c20 c20Var, n0 n0Var, r0 r0Var, o8 o8Var) {
        this.f42752a = 6;
        this.f42753b = o8Var;
        this.f42754c = c20Var;
        this.d = r0Var;
    }

    public m(x9 x9Var, n0 n0Var, TLRPC.User user) {
        this.f42752a = 7;
        this.f42754c = x9Var;
        this.f42753b = n0Var;
        this.d = user;
    }
}
