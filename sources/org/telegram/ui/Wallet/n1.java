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
import org.telegram.ui.Components.p80;
public final class n1 implements View.OnClickListener {
    public final int f35342a;
    public final Object f35343b;
    public final Object f35344c;
    public final Object d;

    public n1(Object obj, Object obj2, Object obj3, int i10) {
        this.f35342a = i10;
        this.f35343b = obj;
        this.f35344c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35342a) {
            case 0:
                j2 j2Var = (j2) this.f35344c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f35343b).optString("text"))) {
                    ai.p(R.string.WalletSigningDataCopied, new ad(j2Var.topBulletinContainer, d6Var));
                    return;
                }
                return;
            case 1:
                p80 p80Var = (p80) this.d;
                f fVar = ((l0) this.f35343b).h;
                String str = ((TL_wallet.currencyRate) this.f35344c).currency;
                if (!TextUtils.equals(fVar.f34915f, str)) {
                    fVar.f34915f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e7) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e7);
                    }
                    fVar.f34912b.I();
                }
                p80Var.u();
                return;
            default:
                p7 p7Var = (p7) this.f35343b;
                p7Var.getClass();
                ((org.telegram.ui.ActionBar.a2[]) this.f35344c)[0].dismiss();
                AndroidUtilities.addToClipboard(p7Var.f35465r);
                ((Runnable) this.d).run();
                return;
        }
    }
}
