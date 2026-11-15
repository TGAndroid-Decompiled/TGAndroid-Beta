package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.x21;
public final class d implements s10 {
    public final int f43710a;
    public final Object f43711b;

    public d(Object obj, int i7) {
        this.f43710a = i7;
        this.f43711b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String z10;
        p41 p41Var;
        switch (this.f43710a) {
            case 0:
                f fVar = (f) this.f43711b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    org.telegram.ui.Cells.y0.t(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.d.c(new e(fVar, currencyrates, 0));
                    return;
                }
            case 1:
                j jVar = (j) this.f43711b;
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
                ((s10) this.f43711b).a((i0) obj, (String) obj2);
                return;
            case 3:
                x21 x21Var = (x21) this.f43711b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    z10 = null;
                } else {
                    z10 = d2.z(tL_error2, "closeSession");
                }
                x21Var.a(z10);
                return;
            case 4:
                d2 d2Var = (d2) this.f43711b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = d2Var.f43730b;
                ArrayList arrayList = d2Var.d;
                d2Var.f43732e = -1;
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
                p41 p41Var2 = (p41) obj2;
                ((ArrayList) obj).add(b41.k(((x2) this.f43711b).U1));
                return;
            case 6:
                o3 o3Var = (o3) this.f43711b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!o3Var.T && !o3Var.S) {
                    o3Var.H = bitmap;
                    o3Var.f44228n.invalidate();
                    o3Var.d();
                    o3Var.F.a(bitmap2);
                    o3Var.h.post(new i3(o3Var, 0));
                    return;
                }
                bitmap.recycle();
                bitmap2.recycle();
                return;
            case 7:
                y5 y5Var = (y5) this.f43711b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    y5Var.S0 = true;
                    y5Var.T0 = password.has_password;
                    bi.v3 v3Var = y5Var.f38882a;
                    if (v3Var != null && (p41Var = v3Var.f39895g3) != null) {
                        p41Var.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                z10 z10Var = (z10) this.f43711b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    z10Var.a(null);
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        vf.c.t(T.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                z10Var.a((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((k7) this.f43711b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((z9) this.f43711b).h = false;
                return;
        }
    }

    public d(l0 l0Var, j jVar) {
        this.f43710a = 1;
        this.f43711b = jVar;
    }
}
