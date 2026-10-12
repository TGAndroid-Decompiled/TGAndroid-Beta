package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.am;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.zc;
public final class n1 implements View.OnClickListener {
    public final int f35109a;
    public final Object f35110b;
    public final Object f35111c;
    public final Object d;

    public n1(Object obj, Object obj2, Object obj3, int i10) {
        this.f35109a = i10;
        this.f35110b = obj;
        this.f35111c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35109a) {
            case 0:
                j2 j2Var = (j2) this.f35111c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f35110b).optString("text"))) {
                    am.p(R.string.WalletSigningDataCopied, new zc(j2Var.topBulletinContainer, c6Var));
                    return;
                }
                return;
            case 1:
                s80 s80Var = (s80) this.d;
                f fVar = ((l0) this.f35110b).h;
                String str = ((TL_wallet.currencyRate) this.f35111c).currency;
                if (!TextUtils.equals(fVar.f34690f, str)) {
                    fVar.f34690f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e7) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e7);
                    }
                    fVar.f34687b.I();
                }
                s80Var.u();
                return;
            default:
                p7 p7Var = (p7) this.f35110b;
                p7Var.getClass();
                ((org.telegram.ui.ActionBar.a2[]) this.f35111c)[0].dismiss();
                AndroidUtilities.addToClipboard(p7Var.f35241r);
                ((Runnable) this.d).run();
                return;
        }
    }
}
