package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.m71;
public final class n1 implements View.OnClickListener {
    public final int f34624a;
    public final Object f34625b;
    public final Object f34626c;
    public final Object d;

    public n1(Object obj, Object obj2, Object obj3, int i10) {
        this.f34624a = i10;
        this.f34625b = obj;
        this.f34626c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34624a) {
            case 0:
                j2 j2Var = (j2) this.f34626c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f34625b).optString("text"))) {
                    wh.p(R.string.WalletSigningDataCopied, new xc(j2Var.topBulletinContainer, d6Var));
                    return;
                }
                return;
            case 1:
                x2 x2Var = (x2) this.f34625b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f34626c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!x2Var.M) {
                    if (x2Var.d) {
                        x2Var.P = new v2(0, n2Var);
                    } else if (x2Var.f35119c && !TextUtils.isEmpty(cardVar.address)) {
                        x2Var.P = new m71(29, n2Var, cardVar);
                    } else {
                        return;
                    }
                    x2Var.dismiss();
                    return;
                }
                return;
            case 2:
                i80 i80Var = (i80) this.d;
                f fVar = ((m0) this.f34625b).h;
                String str = ((TL_wallet.currencyRate) this.f34626c).currency;
                if (!TextUtils.equals(fVar.f34184f, str)) {
                    fVar.f34184f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.f34182b.J();
                }
                i80Var.u();
                return;
            default:
                n8 n8Var = (n8) this.f34625b;
                n8Var.getClass();
                ((org.telegram.ui.ActionBar.b2[]) this.f34626c)[0].dismiss();
                AndroidUtilities.addToClipboard(n8Var.f34649r);
                ((Runnable) this.d).run();
                return;
        }
    }
}
