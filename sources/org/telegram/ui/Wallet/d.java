package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.mt;
public final class d implements Utilities.Callback2 {
    public final int f33031a;
    public final Object f33032b;

    public d(Object obj, int i10) {
        this.f33031a = i10;
        this.f33032b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String x10;
        z61 z61Var;
        switch (this.f33031a) {
            case 0:
                f fVar = (f) this.f33032b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    i2.d.t(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.stageQueue.postRunnable(new e(fVar, currencyrates, 0));
                    return;
                }
            case 1:
                i iVar = (i) this.f33032b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    if (str2 == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = str2;
                    }
                    j0.i("emulate disable backup, no transaction: ".concat(str));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    iVar.run(null, str2);
                    return;
                }
                iVar.run(Long.valueOf(wallettransaction.fee), null);
                return;
            case 2:
                ((s) this.f33032b).run((TL_wallet.sendTransfer) obj, null, (String) obj2);
                return;
            case 3:
                ((Utilities.Callback2) this.f33032b).run((g0) obj, (String) obj2);
                return;
            case 4:
                mt mtVar = (mt) this.f33032b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    x10 = null;
                } else {
                    x10 = d2.x(tL_error2, "closeSession");
                }
                mtVar.run(x10);
                return;
            case 5:
                d2 d2Var = (d2) this.f33032b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                j0 j0Var = d2Var.f33041b;
                ArrayList arrayList = d2Var.d;
                d2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    j0Var.I();
                    return;
                }
                d2.x(tL_error3, "getSessions");
                j0Var.I();
                return;
            case 6:
                z61 z61Var2 = (z61) obj2;
                ((ArrayList) obj).add(l61.k(((i2) this.f33032b).Y));
                return;
            case 7:
                z4 z4Var = (z4) this.f33032b;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (password != null) {
                    z4Var.F0 = true;
                    z4Var.G0 = password.has_password;
                    b71 b71Var = z4Var.f23964a;
                    if (b71Var != null && (z61Var = b71Var.W2) != null) {
                        z61Var.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Utilities.Callback callback = (Utilities.Callback) this.f33032b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    callback.run(null);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        pf.d.s(U.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                callback.run((tL_error5 == null || (r5 = tL_error5.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((r6) this.f33032b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                ((r8) this.f33032b).f33661f = false;
                return;
        }
    }

    public d(j0 j0Var, i iVar) {
        this.f33031a = 1;
        this.f33032b = iVar;
    }
}
