package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ft;
public final class d implements Utilities.Callback2 {
    public final int f34799a;
    public final Object f34800b;

    public d(Object obj, int i10) {
        this.f34799a = i10;
        this.f34800b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String x10;
        d71 d71Var;
        switch (this.f34799a) {
            case 0:
                f fVar = (f) this.f34800b;
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
                j jVar = (j) this.f34800b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    if (str2 == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = str2;
                    }
                    k0.i("emulate disable backup, no transaction: ".concat(str));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.run(null, str2);
                    return;
                }
                jVar.run(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((t) this.f34800b).run((TL_wallet.sendTransfer) obj, null, (String) obj2);
                return;
            case 3:
                ((Utilities.Callback2) this.f34800b).run((h0) obj, (String) obj2);
                return;
            case 4:
                ft ftVar = (ft) this.f34800b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    x10 = null;
                } else {
                    x10 = e2.x(tL_error2, "closeSession");
                }
                ftVar.run(x10);
                return;
            case 5:
                e2 e2Var = (e2) this.f34800b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = e2Var.f34859b;
                ArrayList arrayList = e2Var.d;
                e2Var.f34861e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    k0Var.I();
                    return;
                }
                e2.x(tL_error3, "getSessions");
                k0Var.I();
                return;
            case 6:
                d71 d71Var2 = (d71) obj2;
                ((ArrayList) obj).add(q61.k(((j2) this.f34800b).Y));
                return;
            case 7:
                b5 b5Var = (b5) this.f34800b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    b5Var.F0 = true;
                    b5Var.G0 = password.has_password;
                    f71 f71Var = b5Var.f26629a;
                    if (f71Var != null && (d71Var = f71Var.W2) != null) {
                        d71Var.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Utilities.Callback callback = (Utilities.Callback) this.f34800b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    callback.run(null);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        of.f.s(U.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                callback.run((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((t6) this.f34800b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((t8) this.f34800b).f35584f = false;
                return;
        }
    }

    public d(k0 k0Var, j jVar) {
        this.f34799a = 1;
        this.f34800b = jVar;
    }
}
