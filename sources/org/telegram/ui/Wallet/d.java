package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.r61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.et;
public final class d implements Utilities.Callback2 {
    public final int f34785a;
    public final Object f34786b;

    public d(Object obj, int i10) {
        this.f34785a = i10;
        this.f34786b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String x10;
        e71 e71Var;
        switch (this.f34785a) {
            case 0:
                f fVar = (f) this.f34786b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    hg.c.t(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.stageQueue.postRunnable(new e(fVar, currencyrates, 0));
                    return;
                }
            case 1:
                k kVar = (k) this.f34786b;
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
                    kVar.run(null, str2);
                    return;
                }
                kVar.run(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((u) this.f34786b).run((TL_wallet.sendTransfer) obj, null, (String) obj2);
                return;
            case 3:
                ((Utilities.Callback2) this.f34786b).run((i0) obj, (String) obj2);
                return;
            case 4:
                et etVar = (et) this.f34786b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    x10 = null;
                } else {
                    x10 = f2.x(tL_error2, "closeSession");
                }
                etVar.run(x10);
                return;
            case 5:
                f2 f2Var = (f2) this.f34786b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = f2Var.f34891b;
                ArrayList arrayList = f2Var.d;
                f2Var.f34893e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    l0Var.I();
                    return;
                }
                f2.x(tL_error3, "getSessions");
                l0Var.I();
                return;
            case 6:
                e71 e71Var2 = (e71) obj2;
                ((ArrayList) obj).add(r61.k(((k2) this.f34786b).Y));
                return;
            case 7:
                c5 c5Var = (c5) this.f34786b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    c5Var.F0 = true;
                    c5Var.G0 = password.has_password;
                    g71 g71Var = c5Var.f26922a;
                    if (g71Var != null && (e71Var = g71Var.W2) != null) {
                        e71Var.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Utilities.Callback callback = (Utilities.Callback) this.f34786b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    callback.run(null);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        of.f.s(U.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                callback.run((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((u6) this.f34786b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((u8) this.f34786b).f35614f = false;
                return;
        }
    }

    public d(l0 l0Var, k kVar) {
        this.f34785a = 1;
        this.f34786b = kVar;
    }
}
