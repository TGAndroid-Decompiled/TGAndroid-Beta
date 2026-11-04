package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.e51;
public final class d implements n10 {
    public final int f42403a;
    public final Object f42404b;

    public d(Object obj, int i3) {
        this.f42403a = i3;
        this.f42404b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String z10;
        f41 f41Var;
        switch (this.f42403a) {
            case 0:
                f fVar = (f) this.f42404b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    k2.p1.w(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.d.c(new e(fVar, currencyrates, 0));
                    return;
                }
            case 1:
                j jVar = (j) this.f42404b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    if (str2 == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = str2;
                    }
                    k0.j("emulate disable backup, no transaction: ".concat(str));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    return;
                }
                jVar.a(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((n10) this.f42404b).a((h0) obj, (String) obj2);
                return;
            case 3:
                e51 e51Var = (e51) this.f42404b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    z10 = null;
                } else {
                    z10 = c2.z(tL_error2, "closeSession");
                }
                e51Var.a(z10);
                return;
            case 4:
                c2 c2Var = (c2) this.f42404b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = c2Var.f42378b;
                ArrayList arrayList = c2Var.d;
                c2Var.f42380e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    k0Var.L();
                    return;
                }
                c2.z(tL_error3, "getSessions");
                k0Var.L();
                return;
            case 5:
                f41 f41Var2 = (f41) obj2;
                ((ArrayList) obj).add(r31.k(((y2) this.f42404b).R1));
                return;
            case 6:
                n3 n3Var = (n3) this.f42404b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!n3Var.T && !n3Var.S) {
                    n3Var.H = bitmap;
                    n3Var.f42918n.invalidate();
                    n3Var.d();
                    n3Var.F.a(bitmap2);
                    n3Var.h.post(new j3(n3Var, 1));
                    return;
                }
                bitmap.recycle();
                bitmap2.recycle();
                return;
            case 7:
                w5 w5Var = (w5) this.f42404b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    w5Var.S0 = true;
                    w5Var.T0 = password.has_password;
                    ai.h4 h4Var = w5Var.f34298a;
                    if (h4Var != null && (f41Var = h4Var.f35594g3) != null) {
                        f41Var.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                u10 u10Var = (u10) this.f42404b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    u10Var.a(null);
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        sf.c.t(T.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                u10Var.a((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((j7) this.f42404b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((w9) this.f42404b).h = false;
                return;
        }
    }

    public d(k0 k0Var, j jVar) {
        this.f42403a = 1;
        this.f42404b = jVar;
    }
}
