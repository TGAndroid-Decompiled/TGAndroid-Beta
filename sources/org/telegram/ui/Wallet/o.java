package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
public final class o implements x10 {
    public final int f44716a;
    public final Object f44717b;
    public final Object f44718c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i7) {
        this.f44716a = i7;
        this.f44717b = obj;
        this.f44718c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        String str;
        int i7 = this.f44716a;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f44718c;
        Object obj4 = this.f44717b;
        switch (i7) {
            case 0:
                u0 u0Var = (u0) obj4;
                q10 q10Var = (q10) obj3;
                String str2 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                u0Var.getClass();
                if (bArr == null) {
                    q10Var.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                u0Var.P.put(str2, walletuseraddress);
                q10Var.a(walletuseraddress, null);
                return;
            case 1:
                u0 u0Var2 = (u0) obj4;
                x10 x10Var = (x10) obj3;
                Runnable runnable = (Runnable) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (x10Var != null) {
                    u0Var2.f45137q.put(wallettransaction, x10Var);
                }
                if (runnable != null) {
                    u0Var2.f45138r.put(wallettransaction, runnable);
                    return;
                } else {
                    u0Var2.getClass();
                    return;
                }
            case 2:
                l2 l2Var = (l2) obj4;
                h2 h2Var = (h2) obj3;
                oi.c cVar = (oi.c) obj2;
                String str3 = (String) obj;
                l2Var.getClass();
                if (!h2Var.f44340n && !l2Var.j(h2Var) && l2Var.A(h2Var) && str3 == null) {
                    z10 = true;
                }
                h2Var.f44342p = z10;
                cVar.a(null, str3);
                return;
            case 3:
                l2 l2Var2 = (l2) obj4;
                h2 h2Var2 = (h2) obj3;
                x10 x10Var2 = (x10) obj2;
                String str4 = (String) obj;
                l2Var2.getClass();
                h2Var2.f44339m = false;
                if (h2Var2.f44344r == null && l2Var2.f44524g == h2Var2) {
                    l2Var2.f44524g = null;
                }
                x10Var2.a(str4);
                return;
            case 4:
                l2 l2Var3 = (l2) obj4;
                l2Var3.getClass();
                org.telegram.messenger.g0.g3(new v7((Object) l2Var3, (Object) ((TL_wallet.tonConnectSession) obj3), (String) obj, (Object) ((k) obj2), 5));
                return;
            case 5:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj4;
                fi.r rVar = (fi.r) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction3 != null) {
                    wallettransaction3.incoming = wallettransaction2.incoming;
                    wallettransaction3.peer = wallettransaction2.peer;
                    wallettransactionArr[0] = wallettransaction3;
                    rVar.a(wallettransaction3);
                    return;
                }
                return;
            case 6:
                e3[] e3VarArr = (e3[]) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                String str5 = (String) obj;
                ((hi.e) obj4).setLoading(false);
                if (!u0.L(str5)) {
                    if (!TextUtils.isEmpty(str5)) {
                        new lc(e3VarArr[0].F, h6Var).f0(str5, false);
                        return;
                    } else {
                        e3VarArr[0].dismiss();
                        return;
                    }
                }
                return;
            case 7:
                d9.f0((d9) obj4, (x10) obj3, (z0) obj2, (r0) obj);
                return;
            case 8:
                na naVar = (na) obj3;
                u0 u0Var3 = (u0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                if (!naVar.f44711r) {
                    if (!TextUtils.isEmpty(str6) && u0.c(naVar.f44709f, u0Var3.y())) {
                        i0 i0Var = new i0(u0Var3, str6, naVar.f44707e, null, new s(naVar, u0Var3, user, str6));
                        u0Var3.x0(i0Var);
                        naVar.f44710n = new m(i0Var, 2);
                        return;
                    }
                    naVar.h = false;
                    naVar.f44703a0.setLoading(false);
                    lc b02 = lc.b0(naVar);
                    if (TextUtils.isEmpty(str6)) {
                        str = gd.N0(2131742775, null);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    b02.f0(str, false);
                    return;
                }
                return;
            case 9:
                ((org.telegram.ui.Cells.h6) ((View) obj)).x((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                return;
            default:
                e3 e3Var = (e3) obj3;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj2;
                String str7 = (String) obj;
                ((hi.e) obj4).setLoading(false);
                if (str7 == null) {
                    e3Var.dismiss();
                    return;
                } else {
                    lc.d0(str7, e3Var.F, h6Var2);
                    return;
                }
        }
    }

    public o(x10 x10Var, u0 u0Var, z0 z0Var, d9 d9Var) {
        this.f44716a = 7;
        this.f44717b = d9Var;
        this.f44718c = x10Var;
        this.d = z0Var;
    }

    public o(na naVar, u0 u0Var, TLRPC.User user) {
        this.f44716a = 8;
        this.f44718c = naVar;
        this.f44717b = u0Var;
        this.d = user;
    }
}
