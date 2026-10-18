package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.m71;
public final class n1 implements View.OnClickListener {
    public final int f34564a;
    public final Object f34565b;
    public final Object f34566c;
    public final Object d;

    public n1(Object obj, Object obj2, Object obj3, int i10) {
        this.f34564a = i10;
        this.f34565b = obj;
        this.f34566c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34564a) {
            case 0:
                j2 j2Var = (j2) this.f34566c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f34565b).optString("text"))) {
                    lk.p(R.string.WalletSigningDataCopied, new xc(j2Var.topBulletinContainer, d6Var));
                    return;
                }
                return;
            case 1:
                z2 z2Var = (z2) this.f34565b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f34566c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!z2Var.P) {
                    if (z2Var.e) {
                        z2Var.S = new w2(0, n2Var);
                    } else if (z2Var.d) {
                        z2Var.S = new w2(1, n2Var);
                    } else if (z2Var.f35166c && !TextUtils.isEmpty(cardVar.address)) {
                        z2Var.S = new m71(29, n2Var, cardVar);
                    } else {
                        return;
                    }
                    z2Var.dismiss();
                    return;
                }
                return;
            case 2:
                TLRPC.TL_shareThemeBackdropOption tL_shareThemeBackdropOption = (TLRPC.TL_shareThemeBackdropOption) this.f34566c;
                i80 i80Var = (i80) this.d;
                a5 a5Var = ((n5) this.f34565b).d;
                if (a5Var != null) {
                    a5Var.setDebugBackdrop(tL_shareThemeBackdropOption);
                }
                i80Var.u();
                return;
            case 3:
                i80 i80Var2 = (i80) this.d;
                f fVar = ((m0) this.f34565b).h;
                String str = ((TL_wallet.currencyRate) this.f34566c).currency;
                if (!TextUtils.equals(fVar.f34161f, str)) {
                    fVar.f34161f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.f34159b.J();
                }
                i80Var2.u();
                return;
            default:
                k8 k8Var = (k8) this.f34565b;
                k8Var.getClass();
                ((org.telegram.ui.ActionBar.b2[]) this.f34566c)[0].dismiss();
                AndroidUtilities.addToClipboard(k8Var.f34408r);
                ((Runnable) this.d).run();
                return;
        }
    }
}
