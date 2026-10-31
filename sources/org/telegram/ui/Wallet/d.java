package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.f11;
public final class d implements j20 {
    public final int f34363a;
    public final Object f34364b;

    public d(Object obj, int i10) {
        this.f34363a = i10;
        this.f34364b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String z10;
        p51 p51Var;
        switch (this.f34363a) {
            case 0:
                f fVar = (f) this.f34364b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    a1.g.z(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.d.c(new e(fVar, currencyrates, 0));
                    return;
                }
            case 1:
                j jVar = (j) this.f34364b;
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
                ((j20) this.f34364b).a((h0) obj, (String) obj2);
                return;
            case 3:
                f11 f11Var = (f11) this.f34364b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    z10 = null;
                } else {
                    z10 = e2.z(tL_error2, "closeSession");
                }
                f11Var.a(z10);
                return;
            case 4:
                e2 e2Var = (e2) this.f34364b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = e2Var.f34446b;
                ArrayList arrayList = e2Var.d;
                e2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    k0Var.L();
                    return;
                }
                e2.z(tL_error3, "getSessions");
                k0Var.L();
                return;
            case 5:
                p51 p51Var2 = (p51) obj2;
                ((ArrayList) obj).add(a51.k(((z2) this.f34364b).Q1));
                return;
            case 6:
                p3 p3Var = (p3) this.f34364b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!p3Var.S && !p3Var.R) {
                    p3Var.G = bitmap;
                    p3Var.f35021n.invalidate();
                    p3Var.d();
                    p3Var.E.a(bitmap2);
                    p3Var.h.post(new l3(p3Var, 1));
                    return;
                }
                bitmap.recycle();
                bitmap2.recycle();
                return;
            case 7:
                b6 b6Var = (b6) this.f34364b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    b6Var.R0 = true;
                    b6Var.S0 = password.has_password;
                    ii iiVar = b6Var.f29837a;
                    if (iiVar != null && (p51Var = iiVar.f30819f3) != null) {
                        p51Var.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                q20 q20Var = (q20) this.f34364b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    q20Var.a(null);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        gf.f.r(T.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                q20Var.a((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((p7) this.f34364b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((ba) this.f34364b).h = false;
                return;
        }
    }

    public d(k0 k0Var, j jVar) {
        this.f34363a = 1;
        this.f34364b = jVar;
    }
}
