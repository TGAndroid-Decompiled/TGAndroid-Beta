package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.zc;
public final class l1 implements View.OnClickListener {
    public final int f33421a;
    public final Object f33422b;
    public final Object f33423c;
    public final Object d;

    public l1(Object obj, Object obj2, Object obj3, int i10) {
        this.f33421a = i10;
        this.f33422b = obj;
        this.f33423c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33421a) {
            case 0:
                h2 h2Var = (h2) this.f33423c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f33422b).optString("text"))) {
                    yh.o(R.string.WalletSigningDataCopied, new zc(h2Var.topBulletinContainer, c6Var));
                    return;
                }
                return;
            case 1:
                m80 m80Var = (m80) this.d;
                f fVar = ((j0) this.f33422b).h;
                String str = ((TL_wallet.currencyRate) this.f33423c).currency;
                if (!TextUtils.equals(fVar.f33162f, str)) {
                    fVar.f33162f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.f33160b.I();
                }
                m80Var.u();
                return;
            default:
                m7 m7Var = (m7) this.f33422b;
                m7Var.getClass();
                ((org.telegram.ui.ActionBar.a2[]) this.f33423c)[0].dismiss();
                AndroidUtilities.addToClipboard(m7Var.f33486r);
                ((Runnable) this.d).run();
                return;
        }
    }
}
