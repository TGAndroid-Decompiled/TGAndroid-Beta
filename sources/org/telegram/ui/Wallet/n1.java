package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.mk;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.k71;
public final class n1 implements View.OnClickListener {
    public final int f34545a;
    public final Object f34546b;
    public final Object f34547c;
    public final Object d;

    public n1(Object obj, Object obj2, Object obj3, int i10) {
        this.f34545a = i10;
        this.f34546b = obj;
        this.f34547c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34545a) {
            case 0:
                j2 j2Var = (j2) this.f34547c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f34546b).optString("text"))) {
                    mk.p(R.string.WalletSigningDataCopied, new xc(j2Var.topBulletinContainer, d6Var));
                    return;
                }
                return;
            case 1:
                z2 z2Var = (z2) this.f34546b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f34547c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!z2Var.R) {
                    if (z2Var.e) {
                        z2Var.U = new u2(1, n2Var);
                    } else if (z2Var.d) {
                        z2Var.U = new u2(0, n2Var);
                    } else if (z2Var.f35170c && !TextUtils.isEmpty(cardVar.address)) {
                        z2Var.U = new k71(29, n2Var, cardVar);
                    } else {
                        return;
                    }
                    z2Var.dismiss();
                    return;
                }
                return;
            case 2:
                i80 i80Var = (i80) this.d;
                f fVar = ((m0) this.f34546b).h;
                String str = ((TL_wallet.currencyRate) this.f34547c).currency;
                if (!TextUtils.equals(fVar.f34187f, str)) {
                    fVar.f34187f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.f34185b.J();
                }
                i80Var.u();
                return;
            default:
                k8 k8Var = (k8) this.f34546b;
                k8Var.getClass();
                ((org.telegram.ui.ActionBar.b2[]) this.f34547c)[0].dismiss();
                AndroidUtilities.addToClipboard(k8Var.f34439r);
                ((Runnable) this.d).run();
                return;
        }
    }
}
