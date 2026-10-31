package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
public final class m implements q20 {
    public final int f34874a;
    public final Object f34875b;
    public final Object f34876c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f34874a = i10;
        this.f34875b = obj;
        this.f34876c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        String str;
        int i10 = this.f34874a;
        boolean z10 = true;
        Object obj2 = this.d;
        Object obj3 = this.f34876c;
        Object obj4 = this.f34875b;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj4;
                j20 j20Var = (j20) obj3;
                String str2 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                k0Var.getClass();
                if (bArr == null) {
                    j20Var.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                k0Var.M.put(str2, walletuseraddress);
                j20Var.a(walletuseraddress, null);
                return;
            case 1:
                e2 e2Var = (e2) obj4;
                a2 a2Var = (a2) obj3;
                bi.d dVar = (bi.d) obj2;
                String str3 = (String) obj;
                e2Var.getClass();
                if (a2Var.f34172n || e2Var.j(a2Var) || !e2Var.A(a2Var) || str3 != null) {
                    z10 = false;
                }
                a2Var.f34174p = z10;
                dVar.a(null, str3);
                return;
            case 2:
                e2 e2Var2 = (e2) obj4;
                a2 a2Var2 = (a2) obj3;
                q20 q20Var = (q20) obj2;
                String str4 = (String) obj;
                e2Var2.getClass();
                a2Var2.f34171m = false;
                if (a2Var2.f34176r == null && e2Var2.f34449g == a2Var2) {
                    e2Var2.f34449g = null;
                }
                q20Var.a(str4);
                return;
            case 3:
                e2 e2Var3 = (e2) obj4;
                e2Var3.getClass();
                org.telegram.messenger.i0.g3(new k7((Object) e2Var3, (Object) ((TL_wallet.tonConnectSession) obj3), (String) obj, (Object) ((k) obj2), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                q4 q4Var = (q4) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    q4Var.a(wallettransaction2);
                    return;
                }
                return;
            case 5:
                z2[] z2VarArr = (z2[]) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                String str5 = (String) obj;
                ((vh.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new cc(z2VarArr[0].E, p6Var).e0(str5, false);
                    return;
                } else {
                    z2VarArr[0].dismiss();
                    return;
                }
            case 6:
                t8.c0((t8) obj4, (q20) obj3, (p0) obj2, (h0) obj);
                return;
            case 7:
                ba baVar = (ba) obj3;
                k0 k0Var2 = (k0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                if (!baVar.f34285r) {
                    if (!TextUtils.isEmpty(str6) && k0.b(baVar.f34283f, k0Var2.t())) {
                        a0 a0Var = new a0(k0Var2, str6, baVar.e, null, new q(baVar, k0Var2, user, str6));
                        k0Var2.m0(a0Var);
                        baVar.f34284n = new l(a0Var, 1);
                        return;
                    }
                    baVar.h = false;
                    baVar.Z.setLoading(false);
                    cc a02 = cc.a0(baVar);
                    if (TextUtils.isEmpty(str6)) {
                        str = cd.L0(2131743065, null);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    a02.e0(str, false);
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Cells.k6) ((View) obj)).z((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                return;
            default:
                z2 z2Var = (z2) obj3;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj2;
                String str7 = (String) obj;
                ((vh.d) obj4).setLoading(false);
                if (str7 == null) {
                    z2Var.dismiss();
                    return;
                } else {
                    cc.c0(str7, z2Var.E, p6Var2);
                    return;
                }
        }
    }

    public m(q20 q20Var, k0 k0Var, p0 p0Var, t8 t8Var) {
        this.f34874a = 6;
        this.f34875b = t8Var;
        this.f34876c = q20Var;
        this.d = p0Var;
    }

    public m(ba baVar, k0 k0Var, TLRPC.User user) {
        this.f34874a = 7;
        this.f34876c = baVar;
        this.f34875b = k0Var;
        this.d = user;
    }
}
