package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;
public final class o implements w10 {
    public final int f44779a;
    public final Object f44780b;
    public final Object f44781c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i7) {
        this.f44779a = i7;
        this.f44780b = obj;
        this.f44781c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        String str;
        int i7 = this.f44779a;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f44781c;
        Object obj4 = this.f44780b;
        switch (i7) {
            case 0:
                v0 v0Var = (v0) obj4;
                p10 p10Var = (p10) obj3;
                String str2 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                v0Var.getClass();
                if (bArr == null) {
                    p10Var.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                v0Var.P.put(str2, walletuseraddress);
                p10Var.a(walletuseraddress, null);
                return;
            case 1:
                v0 v0Var2 = (v0) obj4;
                w10 w10Var = (w10) obj3;
                Runnable runnable = (Runnable) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (w10Var != null) {
                    v0Var2.f45269q.put(wallettransaction, w10Var);
                }
                if (runnable != null) {
                    v0Var2.f45270r.put(wallettransaction, runnable);
                    return;
                } else {
                    v0Var2.getClass();
                    return;
                }
            case 2:
                m2 m2Var = (m2) obj4;
                i2 i2Var = (i2) obj3;
                oi.c cVar = (oi.c) obj2;
                String str3 = (String) obj;
                m2Var.getClass();
                if (!i2Var.f44472n && !m2Var.j(i2Var) && m2Var.A(i2Var) && str3 == null) {
                    z10 = true;
                }
                i2Var.f44474p = z10;
                cVar.a(null, str3);
                return;
            case 3:
                m2 m2Var2 = (m2) obj4;
                i2 i2Var2 = (i2) obj3;
                w10 w10Var2 = (w10) obj2;
                String str4 = (String) obj;
                m2Var2.getClass();
                i2Var2.f44471m = false;
                if (i2Var2.f44476r == null && m2Var2.f44653g == i2Var2) {
                    m2Var2.f44653g = null;
                }
                w10Var2.a(str4);
                return;
            case 4:
                m2 m2Var3 = (m2) obj4;
                m2Var3.getClass();
                org.telegram.messenger.g0.g3(new w7((Object) m2Var3, (Object) ((TL_wallet.tonConnectSession) obj3), (String) obj, (Object) ((k) obj2), 5));
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
                f3[] f3VarArr = (f3[]) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                String str5 = (String) obj;
                ((hi.e) obj4).setLoading(false);
                if (!v0.L(str5)) {
                    if (!TextUtils.isEmpty(str5)) {
                        new kc(f3VarArr[0].F, i6Var).f0(str5, false);
                        return;
                    } else {
                        f3VarArr[0].dismiss();
                        return;
                    }
                }
                return;
            case 7:
                e9.f0((e9) obj4, (w10) obj3, (a1) obj2, (s0) obj);
                return;
            case 8:
                oa oaVar = (oa) obj3;
                v0 v0Var3 = (v0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                if (!oaVar.f44843r) {
                    if (!TextUtils.isEmpty(str6) && v0.c(oaVar.f44841f, v0Var3.y())) {
                        j0 j0Var = new j0(v0Var3, str6, oaVar.f44839e, null, new t(oaVar, v0Var3, user, str6));
                        v0Var3.x0(j0Var);
                        oaVar.f44842n = new m(j0Var, 2);
                        return;
                    }
                    oaVar.h = false;
                    oaVar.f44835a0.setLoading(false);
                    kc b02 = kc.b0(oaVar);
                    if (TextUtils.isEmpty(str6)) {
                        str = gd.N0(2131742768, null);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    b02.f0(str, false);
                    return;
                }
                return;
            case 9:
                ((org.telegram.ui.Cells.g6) ((View) obj)).z((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                return;
            default:
                f3 f3Var = (f3) obj3;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj2;
                String str7 = (String) obj;
                ((hi.e) obj4).setLoading(false);
                if (str7 == null) {
                    f3Var.dismiss();
                    return;
                } else {
                    kc.d0(str7, f3Var.F, i6Var2);
                    return;
                }
        }
    }

    public o(w10 w10Var, v0 v0Var, a1 a1Var, e9 e9Var) {
        this.f44779a = 7;
        this.f44780b = e9Var;
        this.f44781c = w10Var;
        this.d = a1Var;
    }

    public o(oa oaVar, v0 v0Var, TLRPC.User user) {
        this.f44779a = 8;
        this.f44781c = oaVar;
        this.f44780b = v0Var;
        this.d = user;
    }
}
