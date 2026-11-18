package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.p51;
public final class e implements q10 {
    public final int f44095a;
    public final Object f44096b;

    public e(Object obj, int i7) {
        this.f44095a = i7;
        this.f44096b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String z10;
        z41 z41Var;
        switch (this.f44095a) {
            case 0:
                g gVar = (g) this.f44096b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    p5.c.s(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.d.c(new f(gVar, currencyrates, 0));
                    return;
                }
            case 1:
                j jVar = (j) this.f44096b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    if (str2 == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = str2;
                    }
                    u0.n("emulate disable backup, no transaction: ".concat(str));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    return;
                }
                jVar.a(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((q10) this.f44096b).a((r0) obj, (String) obj2);
                return;
            case 3:
                p51 p51Var = (p51) this.f44096b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    z10 = null;
                } else {
                    z10 = l2.z(tL_error2, "closeSession");
                }
                p51Var.a(z10);
                return;
            case 4:
                l2 l2Var = (l2) this.f44096b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                u0 u0Var = l2Var.f44480b;
                ArrayList arrayList = l2Var.d;
                l2Var.f44482e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    u0Var.T();
                    return;
                }
                l2.z(tL_error3, "getSessions");
                u0Var.T();
                return;
            case 5:
                z41 z41Var2 = (z41) obj2;
                ((ArrayList) obj).add(l41.k(((e3) this.f44096b).U1));
                return;
            case 6:
                w3 w3Var = (w3) this.f44096b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!w3Var.T && !w3Var.S) {
                    w3Var.H = bitmap;
                    w3Var.f45205n.invalidate();
                    w3Var.d();
                    w3Var.F.a(bitmap2);
                    w3Var.h.post(new q3(w3Var, 0));
                    return;
                }
                bitmap.recycle();
                bitmap2.recycle();
                return;
            case 7:
                n6 n6Var = (n6) this.f44096b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    n6Var.V0 = true;
                    n6Var.W0 = password.has_password;
                    bi.d6 d6Var = n6Var.f33530a;
                    if (d6Var != null && (z41Var = d6Var.f34607g3) != null) {
                        z41Var.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                w4 w4Var = (w4) this.f44096b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    w4Var.a(null);
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null) {
                        vf.c.t(T.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                w4Var.a((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((z7) this.f44096b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((na) this.f44096b).h = false;
                return;
        }
    }

    public e(u0 u0Var, j jVar) {
        this.f44095a = 1;
        this.f44096b = jVar;
    }
}
