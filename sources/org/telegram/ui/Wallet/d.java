package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public final class d implements v10 {
    public final int f42371a;
    public final Object f42372b;

    public d(Object obj, int i7) {
        this.f42371a = i7;
        this.f42372b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String z9;
        l41 l41Var;
        switch (this.f42371a) {
            case 0:
                f fVar = (f) this.f42372b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    org.telegram.ui.Cells.f1.u(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.d.c(new e(fVar, currencyrates, 0));
                    return;
                }
            case 1:
                j jVar = (j) this.f42372b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    if (str2 == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = str2;
                    }
                    m0.j("emulate disable backup, no transaction: ".concat(str));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    return;
                }
                jVar.a(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((v10) this.f42372b).a((j0) obj, (String) obj2);
                return;
            case 3:
                t tVar = (t) this.f42372b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    z9 = null;
                } else {
                    z9 = e2.z(tL_error2, "closeSession");
                }
                tVar.a(z9);
                return;
            case 4:
                e2 e2Var = (e2) this.f42372b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m0 m0Var = e2Var.f42428b;
                ArrayList arrayList = e2Var.d;
                e2Var.f42430e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    m0Var.L();
                    return;
                }
                e2.z(tL_error3, "getSessions");
                m0Var.L();
                return;
            case 5:
                l41 l41Var2 = (l41) obj2;
                ((ArrayList) obj).add(x31.k(((z2) this.f42372b).Q1));
                return;
            case 6:
                o3 o3Var = (o3) this.f42372b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!o3Var.S && !o3Var.R) {
                    o3Var.G = bitmap;
                    o3Var.f42947n.invalidate();
                    o3Var.d();
                    o3Var.E.a(bitmap2);
                    o3Var.h.post(new k3(o3Var, 1));
                    return;
                }
                bitmap.recycle();
                bitmap2.recycle();
                return;
            case 7:
                x5 x5Var = (x5) this.f42372b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    x5Var.R0 = true;
                    x5Var.S0 = password.has_password;
                    fi.w3 w3Var = x5Var.f36243a;
                    if (w3Var != null && (l41Var = w3Var.f37190f3) != null) {
                        l41Var.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                c20 c20Var = (c20) this.f42372b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    c20Var.a(null);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        vf.c.t(T.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                c20Var.a((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((j7) this.f42372b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((w9) this.f42372b).h = false;
                return;
        }
    }

    public d(m0 m0Var, j jVar) {
        this.f42371a = 1;
        this.f42372b = jVar;
    }
}
