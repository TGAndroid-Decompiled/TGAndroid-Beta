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
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.xc;
public final class p implements Utilities.Callback {
    public final int f34690a;
    public final Object f34691b;
    public final Object f34692c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f34690a = i10;
        this.f34691b = obj;
        this.f34692c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        switch (this.f34690a) {
            case 0:
                m0 m0Var = (m0) this.f34691b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f34692c;
                String str2 = (String) this.d;
                byte[] bArr = (byte[]) obj;
                m0Var.getClass();
                if (bArr == null) {
                    callback2.run(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                m0Var.M.put(str2, walletuseraddress);
                callback2.run(walletuseraddress, null);
                return;
            case 1:
                f2 f2Var = (f2) this.f34691b;
                b2 b2Var = (b2) this.f34692c;
                ki.c cVar = (ki.c) this.d;
                String str3 = (String) obj;
                f2Var.getClass();
                if (!b2Var.f34029n && !f2Var.i(b2Var) && f2Var.y(b2Var) && str3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b2Var.f34031p = z10;
                cVar.run(null, str3);
                return;
            case 2:
                f2 f2Var2 = (f2) this.f34691b;
                b2 b2Var2 = (b2) this.f34692c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str4 = (String) obj;
                f2Var2.getClass();
                b2Var2.f34028m = false;
                if (b2Var2.f34033r == null && f2Var2.f34195g == b2Var2) {
                    f2Var2.f34195g = null;
                }
                callback.run(str4);
                return;
            case 3:
                f2 f2Var3 = (f2) this.f34691b;
                f2Var3.getClass();
                AndroidUtilities.runOnUIThread(new z6((Object) f2Var3, (Object) ((TL_wallet.tonConnectSession) this.f34692c), (String) obj, (Object) ((l) this.d), 7));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f34691b;
                v3 v3Var = (v3) this.f34692c;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    v3Var.run(wallettransaction2);
                    return;
                }
                return;
            case 5:
                k2[] k2VarArr = (k2[]) this.f34692c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                String str5 = (String) obj;
                ((ei.d) this.f34691b).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new xc(k2VarArr[0].topBulletinContainer, d6Var).e0(str5, false);
                    return;
                } else {
                    k2VarArr[0].dismiss();
                    return;
                }
            case 6:
                m0 m0Var2 = (m0) this.f34691b;
                m0Var2.j0(new e2.o0((Object) m0Var2, (Object) new o((k8) this.f34692c, (Utilities.Callback) obj, (ArrayList) this.d, m0Var2), true, false, 3));
                return;
            case 7:
                t9 t9Var = (t9) this.f34692c;
                m0 m0Var3 = (m0) this.f34691b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str6 = (String) obj;
                if (!t9Var.f34910n) {
                    if (!TextUtils.isEmpty(str6) && m0.a(t9Var.e, m0Var3.s())) {
                        c0 c0Var = new c0(m0Var3, str6, t9Var.d, null, new q(t9Var, m0Var3, user, str6));
                        m0Var3.j0(c0Var);
                        t9Var.h = new n(c0Var, 1);
                        return;
                    }
                    t9Var.f34909f = false;
                    t9Var.V.setLoading(false);
                    xc a02 = xc.a0(t9Var);
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
                ((org.telegram.ui.Cells.h6) ((View) obj)).t((TLRPC.User) this.f34691b, null, (CharSequence) this.f34692c, (CharSequence) this.d, false, false);
                return;
            default:
                k2 k2Var = (k2) this.f34692c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                String str7 = (String) obj;
                ((ei.d) this.f34691b).setLoading(false);
                if (str7 == null) {
                    k2Var.dismiss();
                    return;
                } else {
                    xc.c0(str7, k2Var.topBulletinContainer, d6Var2);
                    return;
                }
        }
    }

    public p(v61 v61Var, m0 m0Var, Object obj, int i10) {
        this.f34690a = i10;
        this.f34692c = v61Var;
        this.f34691b = m0Var;
        this.d = obj;
    }
}
