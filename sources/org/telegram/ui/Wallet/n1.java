package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.ai;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.q80;
public final class n1 implements View.OnClickListener {
    public final int f35308a;
    public final Object f35309b;
    public final Object f35310c;
    public final Object d;

    public n1(Object obj, Object obj2, Object obj3, int i10) {
        this.f35308a = i10;
        this.f35309b = obj;
        this.f35310c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35308a) {
            case 0:
                j2 j2Var = (j2) this.f35310c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f35309b).optString("text"))) {
                    ai.p(R.string.WalletSigningDataCopied, new ad(j2Var.topBulletinContainer, d6Var));
                    return;
                }
                return;
            case 1:
                q80 q80Var = (q80) this.d;
                f fVar = ((l0) this.f35309b).h;
                String str = ((TL_wallet.currencyRate) this.f35310c).currency;
                if (!TextUtils.equals(fVar.f34881f, str)) {
                    fVar.f34881f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e7) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e7);
                    }
                    fVar.f34878b.I();
                }
                q80Var.u();
                return;
            default:
                p7 p7Var = (p7) this.f35309b;
                p7Var.getClass();
                ((org.telegram.ui.ActionBar.a2[]) this.f35310c)[0].dismiss();
                AndroidUtilities.addToClipboard(p7Var.f35431r);
                ((Runnable) this.d).run();
                return;
        }
    }
}
