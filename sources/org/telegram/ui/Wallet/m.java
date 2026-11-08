package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
public final class m implements c20 {
    public final int f42759a;
    public final Object f42760b;
    public final Object f42761c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f42759a = i7;
        this.f42760b = obj;
        this.f42761c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        String str;
        int i7 = this.f42759a;
        boolean z9 = true;
        Object obj2 = this.d;
        Object obj3 = this.f42761c;
        Object obj4 = this.f42760b;
        switch (i7) {
            case 0:
                m0 m0Var = (m0) obj4;
                v10 v10Var = (v10) obj3;
                String str2 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                m0Var.getClass();
                if (bArr == null) {
                    v10Var.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                m0Var.M.put(str2, walletuseraddress);
                v10Var.a(walletuseraddress, null);
                return;
            case 1:
                e2 e2Var = (e2) obj4;
                a2 a2Var = (a2) obj3;
                li.c cVar = (li.c) obj2;
                String str3 = (String) obj;
                e2Var.getClass();
                if (a2Var.f42104n || e2Var.j(a2Var) || !e2Var.A(a2Var) || str3 != null) {
                    z9 = false;
                }
                a2Var.f42106p = z9;
                cVar.a(null, str3);
                return;
            case 2:
                e2 e2Var2 = (e2) obj4;
                a2 a2Var2 = (a2) obj3;
                c20 c20Var = (c20) obj2;
                String str4 = (String) obj;
                e2Var2.getClass();
                a2Var2.f42103m = false;
                if (a2Var2.f42108r == null && e2Var2.f42432g == a2Var2) {
                    e2Var2.f42432g = null;
                }
                c20Var.a(str4);
                return;
            case 3:
                e2 e2Var3 = (e2) obj4;
                e2Var3.getClass();
                org.telegram.messenger.g0.h3(new f7((Object) e2Var3, (Object) ((TL_wallet.tonConnectSession) obj3), (String) obj, (Object) ((k) obj2), 6));
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
                z2[] z2VarArr = (z2[]) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                String str5 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new hc(z2VarArr[0].E, f6Var).e0(str5, false);
                    return;
                } else {
                    z2VarArr[0].dismiss();
                    return;
                }
            case 6:
                n8.d0((n8) obj4, (c20) obj3, (q0) obj2, (j0) obj);
                return;
            case 7:
                w9 w9Var = (w9) obj3;
                m0 m0Var2 = (m0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                if (!w9Var.f43312r) {
                    if (!TextUtils.isEmpty(str6) && m0.b(w9Var.f43310f, m0Var2.t())) {
                        c0 c0Var = new c0(m0Var2, str6, w9Var.f43309e, null, new r(w9Var, m0Var2, user, str6));
                        m0Var2.m0(c0Var);
                        w9Var.f43311n = new l(c0Var, 1);
                        return;
                    }
                    w9Var.h = false;
                    w9Var.Z.setLoading(false);
                    hc a02 = hc.a0(w9Var);
                    if (TextUtils.isEmpty(str6)) {
                        str = id.M0(2131743042, null);
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
                z2 z2Var = (z2) obj3;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                String str7 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (str7 == null) {
                    z2Var.dismiss();
                    return;
                } else {
                    hc.c0(str7, z2Var.E, f6Var2);
                    return;
                }
        }
    }

    public m(c20 c20Var, m0 m0Var, q0 q0Var, n8 n8Var) {
        this.f42759a = 6;
        this.f42760b = n8Var;
        this.f42761c = c20Var;
        this.d = q0Var;
    }

    public m(w9 w9Var, m0 m0Var, TLRPC.User user) {
        this.f42759a = 7;
        this.f42761c = w9Var;
        this.f42760b = m0Var;
        this.d = user;
    }
}
