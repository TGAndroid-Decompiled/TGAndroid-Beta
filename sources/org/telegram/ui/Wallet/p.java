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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.zc;
public final class p implements Utilities.Callback {
    public final int f33300a;
    public final Object f33301b;
    public final Object f33302c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f33300a = i10;
        this.f33301b = obj;
        this.f33302c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        switch (this.f33300a) {
            case 0:
                k0 k0Var = (k0) this.f33301b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f33302c;
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
                e2 e2Var = (e2) this.f33301b;
                a2 a2Var = (a2) this.f33302c;
                ji.c cVar = (ji.c) this.d;
                String str3 = (String) obj;
                e2Var.getClass();
                if (!a2Var.f32627n && !e2Var.i(a2Var) && e2Var.y(a2Var) && str3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a2Var.f32629p = z10;
                cVar.run(null, str3);
                return;
            case 2:
                e2 e2Var2 = (e2) this.f33301b;
                a2 a2Var2 = (a2) this.f33302c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str4 = (String) obj;
                e2Var2.getClass();
                a2Var2.f32626m = false;
                if (a2Var2.f32631r == null && e2Var2.f32821g == a2Var2) {
                    e2Var2.f32821g = null;
                }
                callback.run(str4);
                return;
            case 3:
                e2 e2Var3 = (e2) this.f33301b;
                e2Var3.getClass();
                AndroidUtilities.runOnUIThread(new m6((Object) e2Var3, (Object) ((TL_wallet.tonConnectSession) this.f33302c), (String) obj, (Object) ((k) this.d), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f33301b;
                o3 o3Var = (o3) this.f33302c;
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
                j2[] j2VarArr = (j2[]) this.f33302c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                String str5 = (String) obj;
                ((di.d) this.f33301b).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new zc(j2VarArr[0].topBulletinContainer, c6Var).e0(str5, false);
                    return;
                } else {
                    j2VarArr[0].dismiss();
                    return;
                }
            case 6:
                k0 k0Var2 = (k0) this.f33301b;
                k0Var2.h0(new e2.o0((Object) k0Var2, (Object) new r((l7) this.f33302c, (Utilities.Callback) obj, (ArrayList) this.d, k0Var2), true, false, 3));
                return;
            case 7:
                s8 s8Var = (s8) this.f33302c;
                k0 k0Var3 = (k0) this.f33301b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str6 = (String) obj;
                if (!s8Var.f33436n) {
                    if (!TextUtils.isEmpty(str6) && k0.b(s8Var.e, k0Var3.r())) {
                        a0 a0Var = new a0(k0Var3, str6, s8Var.d, null, new o(s8Var, k0Var3, user, str6));
                        k0Var3.h0(a0Var);
                        s8Var.h = new n(a0Var, 1);
                        return;
                    }
                    s8Var.f33435f = false;
                    s8Var.V.setLoading(false);
                    zc a02 = zc.a0(s8Var);
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
                ((org.telegram.ui.Cells.i6) ((View) obj)).u((TLRPC.User) this.f33301b, null, (CharSequence) this.f33302c, (CharSequence) this.d, false, false);
                return;
            default:
                j2 j2Var = (j2) this.f33302c;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.d;
                String str7 = (String) obj;
                ((di.d) this.f33301b).setLoading(false);
                if (str7 == null) {
                    j2Var.dismiss();
                    return;
                } else {
                    zc.c0(str7, j2Var.topBulletinContainer, c6Var2);
                    return;
                }
        }
    }

    public p(d71 d71Var, k0 k0Var, Object obj, int i10) {
        this.f33300a = i10;
        this.f33302c = d71Var;
        this.f33301b = k0Var;
        this.d = obj;
    }
}
