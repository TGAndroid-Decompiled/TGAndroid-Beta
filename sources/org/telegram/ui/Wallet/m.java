package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
public final class m implements c20 {
    public final int f42804a;
    public final Object f42805b;
    public final Object f42806c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f42804a = i7;
        this.f42805b = obj;
        this.f42806c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        String str;
        int i7 = this.f42804a;
        boolean z9 = true;
        Object obj2 = this.d;
        Object obj3 = this.f42806c;
        Object obj4 = this.f42805b;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) obj4;
                v10 v10Var = (v10) obj3;
                String str2 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                l0Var.getClass();
                if (bArr == null) {
                    v10Var.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                l0Var.M.put(str2, walletuseraddress);
                v10Var.a(walletuseraddress, null);
                return;
            case 1:
                d2 d2Var = (d2) obj4;
                z1 z1Var = (z1) obj3;
                li.c cVar = (li.c) obj2;
                String str3 = (String) obj;
                d2Var.getClass();
                if (z1Var.f43423n || d2Var.j(z1Var) || !d2Var.A(z1Var) || str3 != null) {
                    z9 = false;
                }
                z1Var.f43425p = z9;
                cVar.a(null, str3);
                return;
            case 2:
                d2 d2Var2 = (d2) obj4;
                z1 z1Var2 = (z1) obj3;
                c20 c20Var = (c20) obj2;
                String str4 = (String) obj;
                d2Var2.getClass();
                z1Var2.f43422m = false;
                if (z1Var2.f43427r == null && d2Var2.f42291g == z1Var2) {
                    d2Var2.f42291g = null;
                }
                c20Var.a(str4);
                return;
            case 3:
                d2 d2Var3 = (d2) obj4;
                d2Var3.getClass();
                org.telegram.messenger.g0.h3(new h7((Object) d2Var3, (Object) ((TL_wallet.tonConnectSession) obj3), (String) obj, (Object) ((k) obj2), 6));
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
                y2[] y2VarArr = (y2[]) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                String str5 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new gc(y2VarArr[0].E, h6Var).e0(str5, false);
                    return;
                } else {
                    y2VarArr[0].dismiss();
                    return;
                }
            case 6:
                p8.d0((p8) obj4, (c20) obj3, (p0) obj2, (i0) obj);
                return;
            case 7:
                y9 y9Var = (y9) obj3;
                l0 l0Var2 = (l0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                if (!y9Var.f43399r) {
                    if (!TextUtils.isEmpty(str6) && l0.b(y9Var.f43397f, l0Var2.t())) {
                        b0 b0Var = new b0(l0Var2, str6, y9Var.f43396e, null, new q(y9Var, l0Var2, user, str6));
                        l0Var2.m0(b0Var);
                        y9Var.f43398n = new l(b0Var, 1);
                        return;
                    }
                    y9Var.h = false;
                    y9Var.Z.setLoading(false);
                    gc a02 = gc.a0(y9Var);
                    if (TextUtils.isEmpty(str6)) {
                        str = id.M0(2131743039, null);
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
                y2 y2Var = (y2) obj3;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj2;
                String str7 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (str7 == null) {
                    y2Var.dismiss();
                    return;
                } else {
                    gc.c0(str7, y2Var.E, h6Var2);
                    return;
                }
        }
    }

    public m(c20 c20Var, l0 l0Var, p0 p0Var, p8 p8Var) {
        this.f42804a = 6;
        this.f42805b = p8Var;
        this.f42806c = c20Var;
        this.d = p0Var;
    }

    public m(y9 y9Var, l0 l0Var, TLRPC.User user) {
        this.f42804a = 7;
        this.f42806c = y9Var;
        this.f42805b = l0Var;
        this.d = user;
    }
}
