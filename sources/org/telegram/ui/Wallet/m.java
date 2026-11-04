package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
public final class m implements u10 {
    public final int f42805a;
    public final Object f42806b;
    public final Object f42807c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i3) {
        this.f42805a = i3;
        this.f42806b = obj;
        this.f42807c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        String str;
        int i3 = this.f42805a;
        boolean z10 = true;
        Object obj2 = this.d;
        Object obj3 = this.f42807c;
        Object obj4 = this.f42806b;
        switch (i3) {
            case 0:
                k0 k0Var = (k0) obj4;
                n10 n10Var = (n10) obj3;
                String str2 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                k0Var.getClass();
                if (bArr == null) {
                    n10Var.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                k0Var.M.put(str2, walletuseraddress);
                n10Var.a(walletuseraddress, null);
                return;
            case 1:
                c2 c2Var = (c2) obj4;
                y1 y1Var = (y1) obj3;
                mi.c cVar = (mi.c) obj2;
                String str3 = (String) obj;
                c2Var.getClass();
                if (y1Var.f43467n || c2Var.j(y1Var) || !c2Var.A(y1Var) || str3 != null) {
                    z10 = false;
                }
                y1Var.f43469p = z10;
                cVar.a(null, str3);
                return;
            case 2:
                c2 c2Var2 = (c2) obj4;
                y1 y1Var2 = (y1) obj3;
                u10 u10Var = (u10) obj2;
                String str4 = (String) obj;
                c2Var2.getClass();
                y1Var2.f43466m = false;
                if (y1Var2.f43471r == null && c2Var2.f42382g == y1Var2) {
                    c2Var2.f42382g = null;
                }
                u10Var.a(str4);
                return;
            case 3:
                c2 c2Var3 = (c2) obj4;
                c2Var3.getClass();
                org.telegram.messenger.g0.h3(new e7((Object) c2Var3, (Object) ((TL_wallet.tonConnectSession) obj3), (String) obj, (Object) ((k) obj2), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                ei.s sVar = (ei.s) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    sVar.a(wallettransaction2);
                    return;
                }
                return;
            case 5:
                y2[] y2VarArr = (y2[]) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                String str5 = (String) obj;
                ((gi.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new fc(y2VarArr[0].F, e6Var).e0(str5, false);
                    return;
                } else {
                    y2VarArr[0].dismiss();
                    return;
                }
            case 6:
                n8.d0((n8) obj4, (u10) obj3, (o0) obj2, (h0) obj);
                return;
            case 7:
                w9 w9Var = (w9) obj3;
                k0 k0Var2 = (k0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                if (!w9Var.f43365r) {
                    if (!TextUtils.isEmpty(str6) && k0.b(w9Var.f43363f, k0Var2.t())) {
                        a0 a0Var = new a0(k0Var2, str6, w9Var.f43361e, null, new q(w9Var, k0Var2, user, str6));
                        k0Var2.m0(a0Var);
                        w9Var.f43364n = new l(a0Var, 1);
                        return;
                    }
                    w9Var.h = false;
                    w9Var.f43357a0.setLoading(false);
                    fc a02 = fc.a0(w9Var);
                    if (TextUtils.isEmpty(str6)) {
                        str = bd.M0(2131743049, null);
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
                y2 y2Var = (y2) obj3;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                String str7 = (String) obj;
                ((gi.d) obj4).setLoading(false);
                if (str7 == null) {
                    y2Var.dismiss();
                    return;
                } else {
                    fc.c0(str7, y2Var.F, e6Var2);
                    return;
                }
        }
    }

    public m(u10 u10Var, k0 k0Var, o0 o0Var, n8 n8Var) {
        this.f42805a = 6;
        this.f42806b = n8Var;
        this.f42807c = u10Var;
        this.d = o0Var;
    }

    public m(w9 w9Var, k0 k0Var, TLRPC.User user) {
        this.f42805a = 7;
        this.f42807c = w9Var;
        this.f42806b = k0Var;
        this.d = user;
    }
}
