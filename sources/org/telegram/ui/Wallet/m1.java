package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.o71;
public final class m1 implements View.OnClickListener {
    public final int f34795a;
    public final Object f34796b;
    public final Object f34797c;
    public final Object d;

    public m1(Object obj, Object obj2, Object obj3, int i10) {
        this.f34795a = i10;
        this.f34796b = obj;
        this.f34797c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34795a) {
            case 0:
                i2 i2Var = (i2) this.f34797c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f34796b).optString("text"))) {
                    sl.p(R.string.WalletSigningDataCopied, new xc(i2Var.topBulletinContainer, g6Var));
                    return;
                }
                return;
            case 1:
                y2 y2Var = (y2) this.f34796b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f34797c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!y2Var.R) {
                    if (y2Var.e) {
                        y2Var.U = new t2(1, o2Var);
                    } else if (y2Var.d) {
                        y2Var.U = new t2(0, o2Var);
                    } else if (y2Var.f35433c && !TextUtils.isEmpty(cardVar.address)) {
                        y2Var.U = new o71(29, o2Var, cardVar);
                    } else {
                        return;
                    }
                    y2Var.dismiss();
                    return;
                }
                return;
            case 2:
                j80 j80Var = (j80) this.d;
                f fVar = ((l0) this.f34796b).h;
                String str = ((TL_wallet.currencyRate) this.f34797c).currency;
                if (!TextUtils.equals(fVar.f34473f, str)) {
                    fVar.f34473f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.f34471b.J();
                }
                j80Var.u();
                return;
            default:
                l8 l8Var = (l8) this.f34796b;
                l8Var.getClass();
                ((org.telegram.ui.ActionBar.c2[]) this.f34797c)[0].dismiss();
                AndroidUtilities.addToClipboard(l8Var.f34786s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
