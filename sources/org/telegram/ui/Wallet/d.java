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
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public final class d implements v10 {
    public final int f42267a;
    public final Object f42268b;

    public d(Object obj, int i7) {
        this.f42267a = i7;
        this.f42268b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String z9;
        m41 m41Var;
        switch (this.f42267a) {
            case 0:
                f fVar = (f) this.f42268b;
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
                j jVar = (j) this.f42268b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    if (str2 == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = str2;
                    }
                    l0.j("emulate disable backup, no transaction: ".concat(str));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    return;
                }
                jVar.a(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((v10) this.f42268b).a((i0) obj, (String) obj2);
                return;
            case 3:
                s sVar = (s) this.f42268b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    z9 = null;
                } else {
                    z9 = d2.z(tL_error2, "closeSession");
                }
                sVar.a(z9);
                return;
            case 4:
                d2 d2Var = (d2) this.f42268b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = d2Var.f42287b;
                ArrayList arrayList = d2Var.d;
                d2Var.f42289e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    l0Var.L();
                    return;
                }
                d2.z(tL_error3, "getSessions");
                l0Var.L();
                return;
            case 5:
                m41 m41Var2 = (m41) obj2;
                ((ArrayList) obj).add(x31.k(((y2) this.f42268b).T1));
                return;
            case 6:
                p3 p3Var = (p3) this.f42268b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!p3Var.S && !p3Var.R) {
                    p3Var.G = bitmap;
                    p3Var.f42970n.invalidate();
                    p3Var.d();
                    p3Var.E.a(bitmap2);
                    p3Var.h.post(new j3(p3Var, 0));
                    return;
                }
                bitmap.recycle();
                bitmap2.recycle();
                return;
            case 7:
                z5 z5Var = (z5) this.f42268b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    z5Var.R0 = true;
                    z5Var.S0 = password.has_password;
                    fi.w3 w3Var = z5Var.f36518a;
                    if (w3Var != null && (m41Var = w3Var.f37496f3) != null) {
                        m41Var.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                c20 c20Var = (c20) this.f42268b;
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
                WalletEngine2.HttpTransport.lambda$execute$0((l7) this.f42268b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((y9) this.f42268b).h = false;
                return;
        }
    }

    public d(l0 l0Var, j jVar) {
        this.f42267a = 1;
        this.f42268b = jVar;
    }
}
