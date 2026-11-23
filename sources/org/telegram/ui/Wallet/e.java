package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a31;
public final class e implements p10 {
    public final int f44187a;
    public final Object f44188b;

    public e(Object obj, int i7) {
        this.f44187a = i7;
        this.f44188b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String z10;
        b51 b51Var;
        switch (this.f44187a) {
            case 0:
                g gVar = (g) this.f44188b;
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
                j jVar = (j) this.f44188b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    if (str2 == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = str2;
                    }
                    v0.n("emulate disable backup, no transaction: ".concat(str));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    return;
                }
                jVar.a(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((p10) this.f44188b).a((s0) obj, (String) obj2);
                return;
            case 3:
                a31 a31Var = (a31) this.f44188b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    z10 = null;
                } else {
                    z10 = m2.z(tL_error2, "closeSession");
                }
                a31Var.a(z10);
                return;
            case 4:
                m2 m2Var = (m2) this.f44188b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                v0 v0Var = m2Var.f44649b;
                ArrayList arrayList = m2Var.d;
                m2Var.f44651e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    v0Var.T();
                    return;
                }
                m2.z(tL_error3, "getSessions");
                v0Var.T();
                return;
            case 5:
                b51 b51Var2 = (b51) obj2;
                ((ArrayList) obj).add(n41.k(((f3) this.f44188b).U1));
                return;
            case 6:
                x3 x3Var = (x3) this.f44188b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!x3Var.T && !x3Var.S) {
                    x3Var.H = bitmap;
                    x3Var.f45377n.invalidate();
                    x3Var.d();
                    x3Var.F.a(bitmap2);
                    x3Var.h.post(new r3(x3Var, 0));
                    return;
                }
                bitmap.recycle();
                bitmap2.recycle();
                return;
            case 7:
                o6 o6Var = (o6) this.f44188b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    o6Var.V0 = true;
                    o6Var.W0 = password.has_password;
                    bi.i6 i6Var = o6Var.f34213a;
                    if (i6Var != null && (b51Var = i6Var.f35323g3) != null) {
                        b51Var.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                x4 x4Var = (x4) this.f44188b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    x4Var.a(null);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        vf.c.t(T.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                x4Var.a((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((a8) this.f44188b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((oa) this.f44188b).h = false;
                return;
        }
    }

    public e(v0 v0Var, j jVar) {
        this.f44187a = 1;
        this.f44188b = jVar;
    }
}
