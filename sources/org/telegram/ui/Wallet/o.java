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
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.wc;
public final class o implements Utilities.Callback {
    public final int f37040a;
    public final Object f37041b;
    public final Object f37042c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f37040a = i10;
        this.f37041b = obj;
        this.f37042c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        switch (this.f37040a) {
            case 0:
                l0 l0Var = (l0) this.f37041b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f37042c;
                String str2 = (String) this.d;
                byte[] bArr = (byte[]) obj;
                l0Var.getClass();
                if (bArr == null) {
                    callback2.run(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                l0Var.M.put(str2, walletuseraddress);
                callback2.run(walletuseraddress, null);
                return;
            case 1:
                e2 e2Var = (e2) this.f37041b;
                a2 a2Var = (a2) this.f37042c;
                li.c cVar = (li.c) this.d;
                String str3 = (String) obj;
                e2Var.getClass();
                if (!a2Var.f36344n && !e2Var.i(a2Var) && e2Var.y(a2Var) && str3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a2Var.f36346p = z10;
                cVar.run(null, str3);
                return;
            case 2:
                e2 e2Var2 = (e2) this.f37041b;
                a2 a2Var2 = (a2) this.f37042c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str4 = (String) obj;
                e2Var2.getClass();
                a2Var2.f36343m = false;
                if (a2Var2.f36348r == null && e2Var2.f36507g == a2Var2) {
                    e2Var2.f36507g = null;
                }
                callback.run(str4);
                return;
            case 3:
                e2 e2Var3 = (e2) this.f37041b;
                e2Var3.getClass();
                AndroidUtilities.runOnUIThread(new w6((Object) e2Var3, (Object) ((TL_wallet.tonConnectSession) this.f37042c), (String) obj, (Object) ((k) this.d), 7));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f37041b;
                di.s sVar = (di.s) this.f37042c;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    sVar.run(wallettransaction2);
                    return;
                }
                return;
            case 5:
                j2[] j2VarArr = (j2[]) this.f37042c;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                String str5 = (String) obj;
                ((fi.d) this.f37041b).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new wc(j2VarArr[0].topBulletinContainer, u6Var).f0(str5, false);
                    return;
                } else {
                    j2VarArr[0].dismiss();
                    return;
                }
            case 6:
                l0 l0Var2 = (l0) this.f37041b;
                l0Var2.j0(new e2.p0((Object) l0Var2, (Object) new n((h8) this.f37042c, (Utilities.Callback) obj, (ArrayList) this.d, l0Var2), true, false, 3));
                return;
            case 7:
                r9 r9Var = (r9) this.f37042c;
                l0 l0Var3 = (l0) this.f37041b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str6 = (String) obj;
                if (!r9Var.f37199r) {
                    if (!TextUtils.isEmpty(str6) && l0.a(r9Var.f37197f, l0Var3.s())) {
                        b0 b0Var = new b0(l0Var3, str6, r9Var.e, null, new p(r9Var, l0Var3, user, str6));
                        l0Var3.j0(b0Var);
                        r9Var.f37198n = new m(b0Var, 1);
                        return;
                    }
                    r9Var.h = false;
                    r9Var.Z.setLoading(false);
                    wc b02 = wc.b0(r9Var);
                    if (TextUtils.isEmpty(str6)) {
                        str = LocaleController.getString(R.string.WalletRecipientUnavailable);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    b02.f0(str, false);
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Cells.m6) ((View) obj)).s((TLRPC.User) this.f37041b, null, (CharSequence) this.f37042c, (CharSequence) this.d, false, false);
                return;
            default:
                j2 j2Var = (j2) this.f37042c;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) this.d;
                String str7 = (String) obj;
                ((fi.d) this.f37041b).setLoading(false);
                if (str7 == null) {
                    j2Var.dismiss();
                    return;
                } else {
                    wc.d0(str7, j2Var.topBulletinContainer, u6Var2);
                    return;
                }
        }
    }

    public o(m71 m71Var, l0 l0Var, Object obj, int i10) {
        this.f37040a = i10;
        this.f37042c = m71Var;
        this.f37041b = l0Var;
        this.d = obj;
    }
}
