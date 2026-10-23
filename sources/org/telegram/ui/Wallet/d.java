package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public final class d implements Utilities.Callback2 {
    public final int f34383a;
    public final Object f34384b;

    public d(Object obj, int i10) {
        this.f34383a = i10;
        this.f34384b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String x10;
        b71 b71Var;
        switch (this.f34383a) {
            case 0:
                f fVar = (f) this.f34384b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    i2.o1.w(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.stageQueue.postRunnable(new e(fVar, currencyrates, 0));
                    return;
                }
            case 1:
                j jVar = (j) this.f34384b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    if (str2 == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = str2;
                    }
                    l0.i("emulate disable backup, no transaction: ".concat(str));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.run(null, str2);
                    return;
                }
                jVar.run(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((Utilities.Callback2) this.f34384b).run((i0) obj, (String) obj2);
                return;
            case 3:
                w wVar = (w) this.f34384b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    x10 = null;
                } else {
                    x10 = e2.x(tL_error2, "closeSession");
                }
                wVar.run(x10);
                return;
            case 4:
                e2 e2Var = (e2) this.f34384b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = e2Var.f34430b;
                ArrayList arrayList = e2Var.d;
                e2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    l0Var.J();
                    return;
                }
                e2.x(tL_error3, "getSessions");
                l0Var.J();
                return;
            case 5:
                b71 b71Var2 = (b71) obj2;
                ((ArrayList) obj).add(m61.k(((j2) this.f34384b).Y));
                return;
            case 6:
                y2 y2Var = (y2) this.f34384b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!y2Var.S && !y2Var.R) {
                    y2Var.G = bitmap;
                    y2Var.f35435n.invalidate();
                    y2Var.d();
                    y2Var.E.a(bitmap2);
                    y2Var.h.post(new u2(y2Var, 1));
                    return;
                }
                bitmap.recycle();
                bitmap2.recycle();
                return;
            case 7:
                o5 o5Var = (o5) this.f34384b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    o5Var.Q0 = true;
                    o5Var.R0 = password.has_password;
                    d71 d71Var = o5Var.f25907a;
                    if (d71Var != null && (b71Var = d71Var.Z2) != null) {
                        b71Var.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Utilities.Callback callback = (Utilities.Callback) this.f34384b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    callback.run(null);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        pf.d.r(U.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                callback.run((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((b7) this.f34384b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((s9) this.f34384b).f35184f = false;
                return;
        }
    }

    public d(l0 l0Var, j jVar) {
        this.f34383a = 1;
        this.f34384b = jVar;
    }
}
