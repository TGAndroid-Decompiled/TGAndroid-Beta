package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
public final class m implements z10 {
    public final int f44139a;
    public final Object f44140b;
    public final Object f44141c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f44139a = i7;
        this.f44140b = obj;
        this.f44141c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        String str;
        int i7 = this.f44139a;
        boolean z10 = true;
        Object obj2 = this.d;
        Object obj3 = this.f44141c;
        Object obj4 = this.f44140b;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) obj4;
                s10 s10Var = (s10) obj3;
                String str2 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                l0Var.getClass();
                if (bArr == null) {
                    s10Var.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                l0Var.M.put(str2, walletuseraddress);
                s10Var.a(walletuseraddress, null);
                return;
            case 1:
                d2 d2Var = (d2) obj4;
                z1 z1Var = (z1) obj3;
                oi.c cVar = (oi.c) obj2;
                String str3 = (String) obj;
                d2Var.getClass();
                if (z1Var.f44787n || d2Var.j(z1Var) || !d2Var.A(z1Var) || str3 != null) {
                    z10 = false;
                }
                z1Var.f44789p = z10;
                cVar.a(null, str3);
                return;
            case 2:
                d2 d2Var2 = (d2) obj4;
                z1 z1Var2 = (z1) obj3;
                z10 z10Var = (z10) obj2;
                String str4 = (String) obj;
                d2Var2.getClass();
                z1Var2.f44786m = false;
                if (z1Var2.f44791r == null && d2Var2.f43734g == z1Var2) {
                    d2Var2.f43734g = null;
                }
                z10Var.a(str4);
                return;
            case 3:
                d2 d2Var3 = (d2) obj4;
                d2Var3.getClass();
                org.telegram.messenger.g0.h3(new g7((Object) d2Var3, (Object) ((TL_wallet.tonConnectSession) obj3), (String) obj, (Object) ((k) obj2), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                fi.r rVar = (fi.r) obj3;
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
                x2[] x2VarArr = (x2[]) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                String str5 = (String) obj;
                ((hi.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new cc(x2VarArr[0].F, e6Var).e0(str5, false);
                    return;
                } else {
                    x2VarArr[0].dismiss();
                    return;
                }
            case 6:
                p8.d0((p8) obj4, (z10) obj3, (p0) obj2, (i0) obj);
                return;
            case 7:
                z9 z9Var = (z9) obj3;
                l0 l0Var2 = (l0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                if (!z9Var.f44861r) {
                    if (!TextUtils.isEmpty(str6) && l0.b(z9Var.f44859f, l0Var2.t())) {
                        b0 b0Var = new b0(l0Var2, str6, z9Var.f44857e, null, new q(z9Var, l0Var2, user, str6));
                        l0Var2.m0(b0Var);
                        z9Var.f44860n = new l(b0Var, 1);
                        return;
                    }
                    z9Var.h = false;
                    z9Var.f44853a0.setLoading(false);
                    cc a02 = cc.a0(z9Var);
                    if (TextUtils.isEmpty(str6)) {
                        str = hd.M0(2131743039, null);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    a02.e0(str, false);
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Cells.f6) ((View) obj)).x((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                return;
            default:
                x2 x2Var = (x2) obj3;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                String str7 = (String) obj;
                ((hi.d) obj4).setLoading(false);
                if (str7 == null) {
                    x2Var.dismiss();
                    return;
                } else {
                    cc.c0(str7, x2Var.F, e6Var2);
                    return;
                }
        }
    }

    public m(z10 z10Var, l0 l0Var, p0 p0Var, p8 p8Var) {
        this.f44139a = 6;
        this.f44140b = p8Var;
        this.f44141c = z10Var;
        this.d = p0Var;
    }

    public m(z9 z9Var, l0 l0Var, TLRPC.User user) {
        this.f44139a = 7;
        this.f44141c = z9Var;
        this.f44140b = l0Var;
        this.d = user;
    }
}
