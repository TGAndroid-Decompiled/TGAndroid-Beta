package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.wc;
import org.telegram.ui.zc1;
public final class m1 implements View.OnClickListener {
    public final int f36875a;
    public final Object f36876b;
    public final Object f36877c;
    public final Object d;

    public m1(Object obj, Object obj2, Object obj3, int i10) {
        this.f36875a = i10;
        this.f36876b = obj;
        this.f36877c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36875a) {
            case 0:
                i2 i2Var = (i2) this.f36877c;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f36876b).optString("text"))) {
                    vh.m(R.string.WalletSigningDataCopied, new wc(i2Var.topBulletinContainer, u6Var));
                    return;
                }
                return;
            case 1:
                y2 y2Var = (y2) this.f36876b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f36877c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!y2Var.R) {
                    if (y2Var.e) {
                        y2Var.U = new t2(1, r2Var);
                    } else if (y2Var.d) {
                        y2Var.U = new t2(0, r2Var);
                    } else if (y2Var.f37495c && !TextUtils.isEmpty(cardVar.address)) {
                        y2Var.U = new zc1(19, r2Var, cardVar);
                    } else {
                        return;
                    }
                    y2Var.dismiss();
                    return;
                }
                return;
            case 2:
                k80 k80Var = (k80) this.d;
                f fVar = ((l0) this.f36876b).h;
                String str = ((TL_wallet.currencyRate) this.f36877c).currency;
                if (!TextUtils.equals(fVar.f36540f, str)) {
                    fVar.f36540f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.f36538b.J();
                }
                k80Var.u();
                return;
            default:
                k8 k8Var = (k8) this.f36876b;
                k8Var.getClass();
                ((org.telegram.ui.ActionBar.e2[]) this.f36877c)[0].dismiss();
                AndroidUtilities.addToClipboard(k8Var.f36796s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
