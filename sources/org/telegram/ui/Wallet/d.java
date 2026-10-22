package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public final class d implements Utilities.Callback2 {
    public final int f34090a;
    public final Object f34091b;

    public d(Object obj, int i10) {
        this.f34090a = i10;
        this.f34091b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String x10;
        u61 u61Var;
        switch (this.f34090a) {
            case 0:
                f fVar = (f) this.f34091b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    i2.e.v(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.stageQueue.postRunnable(new e(fVar, currencyrates, 0));
                    return;
                }
            case 1:
                k kVar = (k) this.f34091b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    if (str2 == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = str2;
                    }
                    m0.i("emulate disable backup, no transaction: ".concat(str));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    kVar.run(null, str2);
                    return;
                }
                kVar.run(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((Utilities.Callback2) this.f34091b).run((j0) obj, (String) obj2);
                return;
            case 3:
                x xVar = (x) this.f34091b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    x10 = null;
                } else {
                    x10 = f2.x(tL_error2, "closeSession");
                }
                xVar.run(x10);
                return;
            case 4:
                f2 f2Var = (f2) this.f34091b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m0 m0Var = f2Var.f34199b;
                ArrayList arrayList = f2Var.d;
                f2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    m0Var.J();
                    return;
                }
                f2.x(tL_error3, "getSessions");
                m0Var.J();
                return;
            case 5:
                u61 u61Var2 = (u61) obj2;
                ((ArrayList) obj).add(h61.k(((k2) this.f34091b).Y));
                return;
            case 6:
                z2 z2Var = (z2) this.f34091b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!z2Var.S && !z2Var.R) {
                    z2Var.G = bitmap;
                    z2Var.f35176n.invalidate();
                    z2Var.d();
                    z2Var.E.a(bitmap2);
                    z2Var.h.post(new v2(z2Var, 1));
                    return;
                }
                bitmap.recycle();
                bitmap2.recycle();
                return;
            case 7:
                o5 o5Var = (o5) this.f34091b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    o5Var.Q0 = true;
                    o5Var.R0 = password.has_password;
                    w61 w61Var = o5Var.f32359a;
                    if (w61Var != null && (u61Var = w61Var.W2) != null) {
                        u61Var.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Utilities.Callback callback = (Utilities.Callback) this.f34091b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    callback.run(null);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        pf.d.r(U.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                callback.run((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((b7) this.f34091b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((r9) this.f34091b).f34818f = false;
                return;
        }
    }

    public d(m0 m0Var, k kVar) {
        this.f34090a = 1;
        this.f34091b = kVar;
    }
}
