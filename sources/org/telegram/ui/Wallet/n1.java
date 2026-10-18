package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.kk;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.m71;
public final class n1 implements View.OnClickListener {
    public final int f34618a;
    public final Object f34619b;
    public final Object f34620c;
    public final Object d;

    public n1(Object obj, Object obj2, Object obj3, int i10) {
        this.f34618a = i10;
        this.f34619b = obj;
        this.f34620c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34618a) {
            case 0:
                j2 j2Var = (j2) this.f34620c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f34619b).optString("text"))) {
                    kk.p(R.string.WalletSigningDataCopied, new xc(j2Var.topBulletinContainer, d6Var));
                    return;
                }
                return;
            case 1:
                y2 y2Var = (y2) this.f34619b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f34620c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!y2Var.O) {
                    if (y2Var.e) {
                        y2Var.R = new v2(0, n2Var);
                    } else if (y2Var.d) {
                        y2Var.R = new v2(1, n2Var);
                    } else if (y2Var.f35115c && !TextUtils.isEmpty(cardVar.address)) {
                        y2Var.R = new m71(29, n2Var, cardVar);
                    } else {
                        return;
                    }
                    y2Var.dismiss();
                    return;
                }
                return;
            case 2:
                i80 i80Var = (i80) this.d;
                f fVar = ((m0) this.f34619b).h;
                String str = ((TL_wallet.currencyRate) this.f34620c).currency;
                if (!TextUtils.equals(fVar.f34216f, str)) {
                    fVar.f34216f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.f34214b.J();
                }
                i80Var.u();
                return;
            default:
                q8 q8Var = (q8) this.f34619b;
                q8Var.getClass();
                ((org.telegram.ui.ActionBar.b2[]) this.f34620c)[0].dismiss();
                AndroidUtilities.addToClipboard(q8Var.f34805r);
                ((Runnable) this.d).run();
                return;
        }
    }
}
