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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.zc;
public final class o implements Utilities.Callback {
    public final int f33526a;
    public final Object f33527b;
    public final Object f33528c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f33526a = i10;
        this.f33527b = obj;
        this.f33528c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        String str;
        switch (this.f33526a) {
            case 0:
                j0 j0Var = (j0) this.f33527b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f33528c;
                String str2 = (String) this.d;
                byte[] bArr = (byte[]) obj;
                j0Var.getClass();
                if (bArr == null) {
                    callback2.run(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str2;
                walletuseraddress.public_key = bArr;
                j0Var.I.put(str2, walletuseraddress);
                callback2.run(walletuseraddress, null);
                return;
            case 1:
                d2 d2Var = (d2) this.f33527b;
                z1 z1Var = (z1) this.f33528c;
                ji.c cVar = (ji.c) this.d;
                String str3 = (String) obj;
                d2Var.getClass();
                if (!z1Var.f33910n && !d2Var.i(z1Var) && d2Var.y(z1Var) && str3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z1Var.f33912p = z10;
                cVar.run(null, str3);
                return;
            case 2:
                d2 d2Var2 = (d2) this.f33527b;
                z1 z1Var2 = (z1) this.f33528c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String str4 = (String) obj;
                d2Var2.getClass();
                z1Var2.f33909m = false;
                if (z1Var2.f33914r == null && d2Var2.f33044g == z1Var2) {
                    d2Var2.f33044g = null;
                }
                callback.run(str4);
                return;
            case 3:
                d2 d2Var3 = (d2) this.f33527b;
                d2Var3.getClass();
                AndroidUtilities.runOnUIThread(new l6((Object) d2Var3, (Object) ((TL_wallet.tonConnectSession) this.f33528c), (String) obj, (Object) ((j) this.d), 6));
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f33527b;
                n3 n3Var = (n3) this.f33528c;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    n3Var.run(wallettransaction2);
                    return;
                }
                return;
            case 5:
                i2[] i2VarArr = (i2[]) this.f33528c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                String str5 = (String) obj;
                ((di.d) this.f33527b).setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    new zc(i2VarArr[0].topBulletinContainer, c6Var).e0(str5, false);
                    return;
                } else {
                    i2VarArr[0].dismiss();
                    return;
                }
            case 6:
                j0 j0Var2 = (j0) this.f33527b;
                j0Var2.h0(new e2.o0((Object) j0Var2, (Object) new q((k7) this.f33528c, (Utilities.Callback) obj, (ArrayList) this.d, j0Var2), true, false, 3));
                return;
            case 7:
                r8 r8Var = (r8) this.f33528c;
                j0 j0Var3 = (j0) this.f33527b;
                TLRPC.User user = (TLRPC.User) this.d;
                String str6 = (String) obj;
                if (!r8Var.f33662n) {
                    if (!TextUtils.isEmpty(str6) && j0.b(r8Var.e, j0Var3.r())) {
                        z zVar = new z(j0Var3, str6, r8Var.d, null, new n(r8Var, j0Var3, user, str6));
                        j0Var3.h0(zVar);
                        r8Var.h = new m(zVar, 1);
                        return;
                    }
                    r8Var.f33661f = false;
                    r8Var.V.setLoading(false);
                    zc a02 = zc.a0(r8Var);
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
                ((org.telegram.ui.Cells.i6) ((View) obj)).u((TLRPC.User) this.f33527b, null, (CharSequence) this.f33528c, (CharSequence) this.d, false, false);
                return;
            default:
                i2 i2Var = (i2) this.f33528c;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.d;
                String str7 = (String) obj;
                ((di.d) this.f33527b).setLoading(false);
                if (str7 == null) {
                    i2Var.dismiss();
                    return;
                } else {
                    zc.c0(str7, i2Var.topBulletinContainer, c6Var2);
                    return;
                }
        }
    }

    public o(c71 c71Var, j0 j0Var, Object obj, int i10) {
        this.f33526a = i10;
        this.f33528c = c71Var;
        this.f33527b = j0Var;
        this.d = obj;
    }
}
