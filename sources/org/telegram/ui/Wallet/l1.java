package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.p80;
public final class l1 implements View.OnClickListener {
    public final int f35156a;
    public final Object f35157b;
    public final Object f35158c;
    public final Object d;

    public l1(Object obj, Object obj2, Object obj3, int i10) {
        this.f35156a = i10;
        this.f35157b = obj;
        this.f35158c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35156a) {
            case 0:
                h2 h2Var = (h2) this.f35158c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f35157b).optString("text"))) {
                    bi.p(R.string.WalletSigningDataCopied, new ad(h2Var.topBulletinContainer, e6Var));
                    return;
                }
                return;
            case 1:
                p80 p80Var = (p80) this.d;
                f fVar = ((k0) this.f35157b).h;
                String str = ((TL_wallet.currencyRate) this.f35158c).currency;
                if (!TextUtils.equals(fVar.f34882f, str)) {
                    fVar.f34882f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e7) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e7);
                    }
                    fVar.f34879b.I();
                }
                p80Var.u();
                return;
            default:
                m7 m7Var = (m7) this.f35157b;
                m7Var.getClass();
                ((org.telegram.ui.ActionBar.b2[]) this.f35158c)[0].dismiss();
                AndroidUtilities.addToClipboard(m7Var.f35242r);
                ((Runnable) this.d).run();
                return;
        }
    }
}
