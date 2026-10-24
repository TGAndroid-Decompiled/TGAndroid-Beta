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
import org.telegram.ui.Components.vc;
public final class o implements Utilities.Callback {
    public final int f34916a;
    public final Object f34917b;
    public final Object f34918c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f34916a = i10;
        this.f34917b = obj;
        this.f34918c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        switch (this.f34916a) {
            case 0:
                l0 l0Var = (l0) this.f34917b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f34918c;
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
                e2 e2Var = (e2) this.f34917b;
                a2 a2Var = (a2) this.f34918c;
                ki.c cVar = (ki.c) this.d;
                String str3 = (String) obj;
                e2Var.getClass();
                if (!a2Var.f34284n && !e2Var.i(a2Var) && e2Var.y(a2Var) && str3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a2Var.f34286p = z10;
                cVar.run(null, str3);
                return;
            case 2:
                e2 e2Var2 = (e2) this.f34917b;
                a2 a2Var2 = (a2) this.f34918c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str4 = (String) obj;
                e2Var2.getClass();
                a2Var2.f34283m = false;
                if (a2Var2.f34288r == null && e2Var2.f34435g == a2Var2) {
                    e2Var2.f34435g = null;
                }
                callback.run(str4);
                return;
            case 3:
                e2 e2Var3 = (e2) this.f34917b;
                e2Var3.getClass();
                AndroidUtilities.runOnUIThread(new w6((Object) e2Var3, (Object) ((TL_wallet.tonConnectSession) this.f34918c), (String) obj, (Object) ((k) this.d), 7));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f34917b;
                ci.s sVar = (ci.s) this.f34918c;
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
                j2[] j2VarArr = (j2[]) this.f34918c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                String str5 = (String) obj;
                ((ei.d) this.f34917b).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new vc(j2VarArr[0].topBulletinContainer, g6Var).e0(str5, false);
                    return;
                } else {
                    j2VarArr[0].dismiss();
                    return;
                }
            case 6:
                l0 l0Var2 = (l0) this.f34917b;
                l0Var2.j0(new e2.o0((Object) l0Var2, (Object) new n((i8) this.f34918c, (Utilities.Callback) obj, (ArrayList) this.d, l0Var2), true, false, 3));
                return;
            case 7:
                s9 s9Var = (s9) this.f34918c;
                l0 l0Var3 = (l0) this.f34917b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str6 = (String) obj;
                if (!s9Var.f35187n) {
                    if (!TextUtils.isEmpty(str6) && l0.a(s9Var.e, l0Var3.s())) {
                        b0 b0Var = new b0(l0Var3, str6, s9Var.d, null, new p(s9Var, l0Var3, user, str6));
                        l0Var3.j0(b0Var);
                        s9Var.h = new m(b0Var, 1);
                        return;
                    }
                    s9Var.f35186f = false;
                    s9Var.Y.setLoading(false);
                    vc a02 = vc.a0(s9Var);
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
                ((org.telegram.ui.Cells.i6) ((View) obj)).t((TLRPC.User) this.f34917b, null, (CharSequence) this.f34918c, (CharSequence) this.d, false, false);
                return;
            default:
                j2 j2Var = (j2) this.f34918c;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.d;
                String str7 = (String) obj;
                ((ei.d) this.f34917b).setLoading(false);
                if (str7 == null) {
                    j2Var.dismiss();
                    return;
                } else {
                    vc.c0(str7, j2Var.topBulletinContainer, g6Var2);
                    return;
                }
        }
    }

    public o(d71 d71Var, l0 l0Var, Object obj, int i10) {
        this.f34916a = i10;
        this.f34918c = d71Var;
        this.f34917b = l0Var;
        this.d = obj;
    }
}
